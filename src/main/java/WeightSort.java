import java.util.Arrays;
import java.util.List;

/**
 * <p>My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because
 * each month a list with the weights of members is published and each month he is the last on the list
 * which means he is the heaviest. </p>
 * <p>I am the one who establishes the list so I told him:
 * "Don't worry any more, I will modify the order of the list".
 * It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits. </p>
 * <p>For example <code>99</code> will have "weight" <code>18</code>, <code>100</code> will have "weight" <code>1</code>
 * so in the list <code>100</code> will come before <code>99</code>.</p>
 * <p>Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?</p>
 * <h4>Example:</h4>
 * <pre>
 * {@code
 * "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
 * "100 180 90 56 65 74 68 86 99"}
 * </pre>
 * <p>When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:</p>
 * <p><code>180</code> is before <code>90</code> since, having the same "weight" (9),  it comes before as a <em>string</em>.</p>
 * <p>All numbers in the list are positive numbers and the list can be empty.</p>
 * <h4>Notes</h4>
 * <ul>
 * <li>it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers</li>
 * <li>For C: The result is freed.</li>
 * </ul>
 */

public class WeightSort {

    public static String orderWeight(String str) {
        List<String> lst = Arrays.asList(str.split("\\s+"));
        lst.sort((o1, o2) -> {
            int diff = getSum(o1) - getSum(o2);
            return diff == 0 ? o1.compareTo(o2) : diff < 0 ? -1 : 1;
        });
        return String.join(" ", lst);
    }

    private static int getSum(String s) {
        int sum = 0;
        for (String d : s.split("")) {
            sum += Integer.parseInt(d);
        }
        return sum;
    }
}
