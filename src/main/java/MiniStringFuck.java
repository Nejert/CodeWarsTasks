/**
 * <h4>The Language</h4>
 * <p><a href="http://esolangs.org/wiki/MiniStringFuck">MiniStringFuck</a> is a derivative of the famous
 * <a href="http://esolangs.org/wiki/Brainfuck">Brainfuck</a><br> which contains a <strong>memory cell</strong>
 * as its only form of data storage<br> as opposed to a memory tape of 30,000 cells in Brainfuck.<br>
 * The <strong>memory cell</strong> in MiniStringFuck initially starts at <code>0</code>.<br>
 * MiniStringFuck contains only 2 commands as opposed to 8:</p>
 * <ul>
 * <li><code>+</code> - Increment the memory cell.  If it reaches <code>256</code>, wrap to <code>0</code>.</li>
 * <li><code>.</code> - Output the value of the memory cell as a character with code point equal to the value</li>
 * </ul>
 * <p>For example, here is a MiniStringFuck program that outputs the string <code>"Hello, World!"</code>:</p>
 * <pre>{@code ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.
 * +++++++++++++++++++++++++++++.+++++++..+++.++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++.+++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++.++++++++++++++++++++++++.+++.+++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++++++++++++.++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++.}
 * </pre>
 * <p>And here is another program that prints the uppercase English alphabet:</p>
 * <pre>{@code +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+.+.+.+
 * .+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.}
 * </pre>
 * <p>Any characters in a MiniStringFuck program other than <code>+</code> or <code>.</code> are simply non-command
 * characters (no-ops, i.e. do nothing) and therefore can serve as comments in the program.</p>
 * <h4>The Task</h4>
 * <p>Time to write your first Esolang interpreter :D</p>
 * <p>Your task is to implement a MiniStringFuck interpreter <code>myFirstInterpreter()</code>/
 * <code>my_first_interpreter()</code>/<code>Interpreter()</code>/<code>interpret()</code>
 * <code>MyFirstInterpreter()</code> (depending on your language) which accepts exactly 1 required argument
 * <code>code</code>/<code>$code</code>/<code>strng</code> which is the MiniStringFuck program to be executed.
 * The output of the program should then be returned by your interpreter as a string.</p>
 * <p>Since this is the first time you are about to write an interpreter for an Esolang, here are a few quick tips:</p>
 * <ul>
 * <li>If you are afraid that your interpreter will be confused by non-command characters appearing in the MiniStringFuck
 * program, you can try to remove all non-command characters from the <code>code</code> input before letting your
 * interpreter interpret it</li>
 * <li>The memory cell in MiniStringFuck only ever contains a single integer value - think of how it can be modelled in
 * your interpreter</li>
 * <li>If you are stuck as to how to interpret the string as a program, try thinking of strings as an array of characters.
 * Try looping through the "program" like you would an array</li>
 * <li>Writing an interpreter for an Esolang can sometimes be quite confusing!  It never hurts to add a few comments in
 * your interpreter as you implement it to remind yourself of what is happening within the interpreter at every stage</li>
 * </ul>
 * <p><em>NOTE: If you would not like to name your interpreter as</em> <code>myFirstInterpreter()</code>/<code>my_first_interpreter()</code><em>, you can optionally rename it to either</em> <code>miniStringFuck()</code>/<code>mini_string_fuck()</code> <em>or</em> <code>interpreter()</code> <em>instead - the test cases will handle the rest for you.</em>  <strong>Not available in Java, Go, Swift, TypeScript, Haskell, Elixir, C++, C#, Rust, R, Erlang, F#, Factor, COBOL and NASM</strong>; <em>irrelevant to Brainfuck solvers</em> ;)</p>
 * <p>Good luck :D</p>
 */
public class MiniStringFuck {
    public class MyFirstInterpreter {
        private String code;
        private char mem;

        public MyFirstInterpreter(String code) {
            this.code = code;
        }

        public String interpret() {
            StringBuilder sb = new StringBuilder();
            for (char c : code.toCharArray()) {
                switch (c) {
                    case '+' -> mem = (char) ((mem + 1) % 256);
                    case '.' -> sb.append(mem);
                }
            }
            return sb.toString();
        }
    }
}
