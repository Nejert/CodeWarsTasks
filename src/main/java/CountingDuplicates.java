/**
 * Write a function that will return the count of <strong>distinct case-insensitive</strong> alphabetic characters
 * and numeric digits that occur more than once in the input string.
 * The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 * <h2>Example</h2>
 * <pre>
 * {@code "abcde" -> 0 // no characters repeats more than once}
 * {@code "aabbcde" -> 2 // 'a' and 'b'}
 * {@code "aabBcde" -> 2 // 'a' occurs twice and 'b' twice (`b` and `B`)}
 * {@code "indivisibility" -> 1 // 'i' occurs six times}
 * {@code "Indivisibilities" -> 2 // 'i' occurs seven times and 's' occurs twice}
 * {@code "aA11" -> 2 // 'a' and '1'}
 * {@code "ABBA" -> 2 // 'A' and 'B' each occur twice}
 * </pre>
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int res = 0;
        String s = text.toLowerCase();
        for (char c : text.toLowerCase().toCharArray()) {
            long count = s.chars().filter(ch -> ch == c).count();
            if (count > 1) res++;
            s = s.replace(String.valueOf(c), "");
        }
        return res;
    }
}
