import java.util.Arrays;

/**
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.<br>
 * It should remove all values from list {@code a}, which are present in list {@code b} keeping their order.<br>
 *
 * <pre>{@code Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}}</pre>
 *
 * If {@code a} value is present in {@code b}, all of its occurrences must be removed from the other:
 *
 * <pre>{@code Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}}</pre>
 */
public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        for (int n : b) a = Arrays.stream(a).filter(x -> x != n).toArray();
        return a;
    }
}
