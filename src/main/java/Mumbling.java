/**
 * This time no story, no theory. The examples below show you how to write function {@code accum}:
 * <p>
 * Examples:
 * <pre>
 * {@code
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"}
 * </pre>
 * The parameter of accum is a string which includes only letters from <code>a..z</code> and <code>A..Z</code>.
 */
public class Mumbling {
    public static String accum(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            res.append(String.valueOf(c).toUpperCase());
            res.append(String.valueOf(c).toLowerCase().repeat(Math.max(0, i)));
            res.append('-');
            i++;
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
