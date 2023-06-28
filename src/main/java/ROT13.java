/**
 * <p>How can you tell an extrovert from an introvert at NSA?<br>
 * Va gur ryringbef, gur rkgebireg ybbxf ng gur BGURE thl'f fubrf.</p>
 * <p>I found this joke on USENET, but the punchline is scrambled. Maybe you can decipher it?<br>
 * According to Wikipedia, <a href="http://en.wikipedia.org/wiki/ROT13">ROT13</a> is frequently used to obfuscate jokes on USENET.</p>
 * <p>For this task you're only supposed to substitute characters. Not spaces, punctuation, numbers, etc.</p>
 * <h4>Test examples:</h4>
 * <pre>{@code "EBG13 rknzcyr." -> "ROT13 example."
 * "This is my first ROT13 excercise!" -> "Guvf vf zl svefg EBG13 rkprepvfr!"}</pre>
 */
public class ROT13 {
    public static String rot13(String message) {
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c >= 'A' && c <= 'Z') sb.append((char) ((c - 'A' + 13) % 26 + 'A'));
            else if (c >= 'a' && c <= 'z') sb.append((char) ((c - 'a' + 13) % 26 + 'a'));
            else sb.append(c);
        }
        return sb.toString();
    }
}
