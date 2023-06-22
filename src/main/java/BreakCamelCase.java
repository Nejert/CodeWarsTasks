/**
 * <p>Complete the solution so that the function will break up camel casing, using a space between words.</p>
 * <h4>Example</h4>
 * <pre>
 * {@code
 * "camelCasing"  => "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""}
 * </pre>
 */
public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) sb.append(" ").append(c);
            else sb.append(c);
        }
        return sb.toString();
    }
}
