/**
 * <h4>Your Job</h4>
 * <p>  Find the sum of all multiples of <code>n</code> below <code>m</code> </p>
 * <h4>Keep in Mind</h4>
 * <ul>
 * <li><code>n</code> and <code>m</code> are natural numbers (positive integers)</li>
 * <li><code>m</code> is <strong>excluded</strong> from the multiples</li>
 * </ul>
 * <h4>Examples</h4>
 * <pre>
 * {@code
 * Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
 * Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
 * Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
 * Kata.sumMul(4, -7)  // throws IllegalArgumentException
 * }
 * </pre>
 */
public class SumOfMultiples {
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) throw new IllegalArgumentException();
        int sum = 0;
        for (int i = n; i < m; i += n) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumMul(11, 792));
    }
}
