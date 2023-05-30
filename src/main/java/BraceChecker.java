import java.util.ArrayList;

/**
 * Write a function that takes a string of braces, and determines if the order of the braces is valid.
 * It should return true if the string is valid, and false if it's invalid.
 * This Kata is similar to the Valid Parentheses Kata, but introduces new characters:
 * brackets [], and curly braces {}. Thanks to @arnedag for the idea!
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 * <p>
 * What is considered Valid?
 * <p>
 * A string of braces is considered valid if all braces are matched with the correct brace.
 * <p>
 * <h2>Examples</h2>
 * <pre><code>
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 * </code></pre>
 */
public class BraceChecker {
    public boolean isValid(String braces) {
        ArrayList<Character> lst = new ArrayList<>();
        for (char c : braces.toCharArray()) {
            switch (c) {
                case '{', '[', '(' -> lst.add(c);
                case '}' -> {
                    if (mutateArray(lst, '{')) return false;
                }
                case ']' -> {
                    if (mutateArray(lst, '[')) return false;
                }
                case ')' -> {
                    if (mutateArray(lst, '(')) return false;
                }
            }
        }
        return lst.size() == 0;
    }

    private boolean mutateArray(ArrayList<Character> lst, char bracket) {
        int last = lst.lastIndexOf(bracket);
        if (last == -1) return true;
        if (lst.size() > last) {
            lst.subList(last, lst.size()).clear();
        }
        return false;
    }
}
