import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <h4>The Language</h4>
 * <p>Smallfuck is an <a href="http://esolangs.org">esoteric programming language/Esolang</a> invented in 2002 which is
 * a sized-down variant of the famous <a href="http://esolangs.org/wiki/Brainfuck" >Brainfuck</a> Esolang.<br>
 * Key differences include:</p>
 * <ul>
 * <li>Smallfuck operates only on bits as opposed to bytes</li>
 * <li>It has a limited data storage which varies from implementation to implementation depending on the size of the tape</li>
 * <li>It does not define input or output - the "input" is encoded in the initial state of the data storage (tape) and
 * the "output" should be decoded in the final state of the data storage (tape)</li>
 * </ul>
 * <p>Here are a list of commands in Smallfuck:</p>
 * <ul>
 * <li><code>&gt;</code> - Move pointer to the right (by 1 cell)</li>
 * <li><code>&lt;</code> - Move pointer to the left (by 1 cell)</li>
 * <li><code>*</code> - Flip the bit at the current cell</li>
 * <li><code>[</code> - Jump past matching <code>]</code> if value at current cell is <code>0</code></li>
 * <li><code>]</code> - Jump back to matching <code>[</code> (if value at current cell is nonzero)</li>
 * </ul>
 * <p>As opposed to Brainfuck where a program terminates only when all of the commands in the program have been considered
 * (left to right), Smallfuck terminates when any of the two conditions mentioned below become true:</p>
 * <ul>
 * <li>All commands have been considered from left to right</li>
 * <li>The pointer goes out-of-bounds (i.e. if it moves to the left of the first cell or to the right of the last cell of the tape)</li>
 * </ul>
 * <p>Smallfuck is considered to be Turing-complete <strong>if and only if</strong> it had a tape of infinite length;
 * however, since the length of the tape is always defined as finite (as the interpreter cannot return a tape of infinite length),
 * its computational class is of bounded-storage machines with bounded input.</p>
 * <p>More information on this Esolang can be found <a href="http://esolangs.org/wiki/Smallfuck">here</a>.</p>
 * <h4>The Task</h4>
 * <p>Implement a custom Smallfuck interpreter <code>interpreter()</code>
 * (<code>interpreter</code> in Haskell and F#, <code>Interpreter</code> in C#,
 * <code>custom_small_fuck:interpreter/2</code> in Erlang) which accepts the following arguments:</p>
 * <ol>
 * <li><code>code</code> - <strong>Required</strong>.  The Smallfuck program to be executed, passed in as a string.
 * May contain non-command characters.  Your interpreter should simply ignore any non-command characters.</li>
 * <li><code>tape</code> - <strong>Required</strong>.  The initial state of the data storage (tape), passed in
 * <strong>as a string</strong>.  For example, if the string <code>"00101100"</code> is passed in then it should translate
 * to something of this form within your interpreter: <code>[0, 0, 1, 0, 1, 1, 0, 0]</code>.  You may assume that all input
 * strings for <code>tape</code> will be non-empty and will only contain <code>"0"</code>s and <code>"1"</code>s.</li>
 * </ol>
 * <p>Your interpreter should return the final state of the data storage (tape) <strong>as a string</strong> in the same
 * format that it was passed in.  For example, if the tape in your interpreter ends up being <code>[1, 1, 1, 1, 1]</code>
 * then return the string <code>"11111"</code>.</p>
 * <p><em>NOTE: The pointer of the interpreter always starts from the first (leftmost) cell of the tape, same as in Brainfuck.</em></p>
 * <p>Good luck :D</p>
 */
public class SmallFuck {
    public static String interpreter(String code, String tape) {
        int[] intTape = Stream.of(tape.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        char[] codeArr = code.toCharArray();
        int index = 0;
        int bracketsCount = 0;
        int openBracketsPos = 0;
        try {
            for (int i = 0; i < codeArr.length; i++) {
                switch (codeArr[i]) {
                    case '>' -> index++;
                    case '<' -> index--;
                    case '*' -> intTape[index] ^= 1;
                    case '[' -> {
                        if (intTape[index] == 0) {
                            for (int j = i + 1; j < codeArr.length; j++) {
                                if (codeArr[j] == '[') bracketsCount++;
                                else if (codeArr[j] == ']' && bracketsCount != 0) bracketsCount--;
                                else if (codeArr[j] == ']' && bracketsCount == 0) {
                                    i = j;
                                    break;
                                }
                            }
                        }
                    }
                    case ']' -> {
                        if (intTape[index] != 0) {
                            for (int j = i - 1; j >= 0; j--) {
                                if (codeArr[j] == ']') bracketsCount++;
                                else if (codeArr[j] == '[' && bracketsCount != 0) bracketsCount--;
                                else if (codeArr[j] == '[' && bracketsCount == 0) {
                                    i = j;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            return Arrays.stream(intTape)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(""));
        }
        return Arrays.stream(intTape)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(interpreter("*[>[*]]", "00000"));
    }
}
