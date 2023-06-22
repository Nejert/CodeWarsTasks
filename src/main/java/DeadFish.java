import java.util.ArrayList;

/**
 * <p>Write a simple parser that will parse and run Deadfish.</p>
 * <p>Deadfish has 4 commands, each 1 character long:</p>
 * <ul>
 * <li><code>i</code> increments the value (initially <code>0</code>)</li>
 * <li><code>d</code> decrements the value</li>
 * <li><code>s</code> squares the value</li>
 * <li><code>o</code> outputs the value into the return array</li>
 * </ul>
 * <p>Invalid characters should be ignored.</p>
 * <pre>
 * {@code Deadfish.parse("iiisdoso") =- new int[] {8, 64};}
 * </pre>
 */

public class DeadFish {
    public static int[] parse(String data) {
        int val = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (char c : data.toCharArray()) {
            switch (c) {
                case 'i' -> val++;
                case 'd' -> val--;
                case 's' -> val = val * val;
                case 'o' -> arr.add(val);
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}
