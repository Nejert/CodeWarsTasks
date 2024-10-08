/**
 * You get an array of numbers, return the sum of all the positives ones.
 * <h2>Example</h2>
 * <pre>{@code [1, -4, 7, 12] => 1 + 7 + 12 = 20}</pre>
 * Note: if there is nothing to sum, the sum is default to 0.
 */
public class SumOfPositive {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            if (n > 0) sum += n;
        }
        return sum;
    }
}
