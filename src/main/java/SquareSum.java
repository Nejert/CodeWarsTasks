/**
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.<br>
 * For example, for {@code [1, 2, 2]} it should return 9 because:
 * <pre>{@code 1^2 + 2^2 + 2^2 = 9}</pre>
 */
public class SquareSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int num : n) {
            sum += num * num;
        }
        return sum;
    }
}
