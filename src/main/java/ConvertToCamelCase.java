/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
 * <h2>Examples</h2>
 * <pre>
 * {@code "the-stealth-warrior"} gets converted to {@code "theStealthWarrior"}
 * {@code "The_Stealth_Warrior"} gets converted to {@code "TheStealthWarrior"}
 * {@code "The_Stealth-Warrior"} gets converted to {@code "TheStealthWarrior"}
 * </pre>
 */
public class ConvertToCamelCase {
    static String toCamelCase(String s) {
        StringBuilder res = new StringBuilder();
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == '-' || c == '_') {
                flag = true;
                continue;
            }
            if (flag) {
                res.append(String.valueOf(c).toUpperCase());
                flag = false;
                continue;
            }
            res.append(c);
        }
        return res.toString();
    }
}
