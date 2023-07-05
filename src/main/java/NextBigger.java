import java.util.Arrays;

/**
 * <h4>Next bigger number with the same digits</h4>
 * <p>Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits.<br>
 * For example:</p>
 * <pre>{@code 12   ==> 21
 * 513  ==> 531
 * 2017 ==> 2071
 * }</pre>
 * <p>If the digits can't be rearranged to form a bigger number, return <code>-1</code> (or <code>nil</code> in Swift, <code>None</code> in Rust):</p>
 * <pre>{@code 9   ==> -1
 * 111 ==> -1
 * 531 ==> -1
 * }</pre>
 */
public class NextBigger {
    public static long nextBiggerNumber(long n) {
        char[] cStr = String.valueOf(n).toCharArray();
        long res;
        for (int i = cStr.length - 2; i >= 0; i--) {
            if (cStr[i] < cStr[i + 1]) {
                Arrays.sort(cStr, i + 1, cStr.length);
                for (int j = i + 1; j < cStr.length; j++) {
                    if (cStr[j] > cStr[i]) {
                        char tmp = cStr[i];
                        cStr[i] = cStr[j];
                        cStr[j] = tmp;
                        break;
                    }
                }
                break;
            }
        }
        res = Long.parseLong(new String(cStr));
        return res == n ? -1 : res;
    }

    /*
    598848484_59853
    598848484_83559
    */
    public static void main(String[] args) {
        long num = 598848484_59853L;
        char[] cStr = String.valueOf(num).toCharArray();
        for (int i = cStr.length - 2; i >= 0; i--) {
            if (cStr[i] < cStr[i + 1]) {
                Arrays.sort(cStr, i + 1, cStr.length);
                for (int j = i + 1; j < cStr.length; j++) {
                    if (cStr[j] > cStr[i]) {
                        char tmp = cStr[i];
                        cStr[i] = cStr[j];
                        cStr[j] = tmp;
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(num);
        System.out.println(new String(cStr));
    }
}
