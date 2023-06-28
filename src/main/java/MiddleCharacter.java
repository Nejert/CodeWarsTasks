/**
 * <p>You are going to be given a word. Your job is to return the middle character of the word.
 * If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.</p>
 * <h4>Examples:</h4>
 * <pre>{@code Kata.getMiddle("test")    should return "es"
 * Kata.getMiddle("testing") should return "t"
 * Kata.getMiddle("middle")  should return "dd"
 * Kata.getMiddle("A")       should return "A"}
 * </pre>
 * <h4>Input</h4>
 * <p>A word (string) of length <code>0 &lt; str &lt; 1000</code> (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.</p>
 * <h4>Output</h4>
 * <p>The middle character(s) of the word represented as a string. </p>
 */
public class MiddleCharacter {
    public static String getMiddle(String word) {
        String res;
        if (word.length() % 2 == 0) res = word.substring((word.length() >> 1) - 1, (word.length() >> 1) + 1);
        else res = String.valueOf(word.charAt(word.length() >> 1));
        return res;
    }
}
