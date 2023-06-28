import java.math.BigInteger;

/**
 * <p>The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8.
 * It's easy to see that the sum of the perimeters of these squares is:</p>
 * <pre>{@code 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80} </pre>
 * <p>Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed
 * in the same manner as in the drawing: </p>
 * <p><img src="http://i.imgur.com/EYcuB1wm.jpg"></p>
 * <h4>Hint:</h4>
 * <p>See Fibonacci sequence</p>
 * <h4>Ref:</h4>
 * <p><a href="http://oeis.org/A000045">http://oeis.org/A000045</a></p>
 * <p>The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n)
 * and returns the total perimeter of all the squares.</p>
 * <pre>{@code perimeter(5)  should return 80
 * perimeter(7)  should return 216
 * }</pre>
 */
public class PerimeterOfSquares {
    static final int MAX = 30000;

    // Create an array for memoization
    static BigInteger[] f = new BigInteger[MAX];

    // Returns n'th Fibonacci number using table f[]
    static BigInteger fib(int n) {

        // Base cases
        if (n == 0) return BigInteger.ZERO;
        if (n == 1 || n == 2) return (f[n] = BigInteger.ONE);

        // If fib(n) is already computed
        if (f[n] != null) {
            return f[n];
        }

        int k = ((n & 1) > 0) ? (n + 1) / 2 : n / 2;

        // Applying above formula [Note value n&1 is 1
        // if n is odd, else 0].
        f[n] = (n & 1) > 0 ? (fib(k).pow(2).add(fib(k - 1).pow(2)))
                : (fib(k - 1).multiply(BigInteger.valueOf(2)).add(fib(k))).multiply(fib(k));

        return f[n];
    }

    // Computes value of first Fibonacci numbers
    static BigInteger calculateSum(int n) {
        return fib(n + 2).subtract(BigInteger.valueOf(1));
    }

    public static BigInteger perimeter(BigInteger n) {
        return calculateSum(n.intValue() + 1).multiply(new BigInteger("4"));
    }

    public static BigInteger perimeter1(BigInteger n) {

        BigInteger a;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
   /* public static BigInteger fib(int n) {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger next;
        for (int i = 2; i <= n; ++i) {
            next = a.add(b);
            a = b;
            b = next;
        }
        return b;
    }*/

   /* public static long fib(long n) {
        long a = 0L;
        long b = 1L;
        long next;
        for (int i = 2; i <= n; ++i) {
            next = a + b;
            a = b;
            b = next;
        }
        return b;
    }*/

    /*private static BigInteger getFibonacciSum(int n) {
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i <= n; i++) {
            sum = sum.add(fib(i + 1));
        }
        return sum;
    }*/

    /*public static BigInteger fib(int n) {
        double root5 = Math.sqrt(5);
        BigDecimal gr = BigDecimal.valueOf((1 + root5) / 2);
        BigDecimal igr = BigDecimal.valueOf(1 - gr.doubleValue());
        BigDecimal value = gr.pow(n).subtract(igr.pow(n));
        value = value.divide(BigDecimal.valueOf(root5), RoundingMode.FLOOR);
        return value.add(BigDecimal.valueOf(0.5)).toBigInteger();
    }*/

    public static void main(String[] args) {
        long a = System.nanoTime();

        System.out.println(perimeter(new BigInteger("24300")));
        //System.out.println(fib(7));
        //System.out.println(getFibonacciSum(24300));
        //System.out.println(calculateSum(5+1));

        System.out.println(System.nanoTime() - a);
        //for (int i = 0; i <= 24300; i++) {
        //    System.out.println("i = " + i + " fib = " + fib(i + 1));
        //}
    }
}
