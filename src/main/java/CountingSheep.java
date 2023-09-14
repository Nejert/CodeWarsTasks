/**
 * <p>Consider an array/list of sheep where some sheep may be missing from their place.
 * We need a function that counts the number of sheep present in the array (true means present).</p>
 * <p>For example,</p>
 * <pre>{@code  [true,  true,  true,  false,
 *   true,  true,  true,  true ,
 *   true,  false, true,  false,
 *   true,  false, false, true ,
 *   true,  true,  true,  true ,
 *   false, false, true,  true]}</pre>
 * <p>The correct answer would be {@code 17}.</p>
 * <p>Hint: Don't forget to check for bad values like {@code null / undefined}</p>
 */
public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int b = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            try {
                if (arrayOfSheeps[i]) b++;
            } catch (NullPointerException ignore) {
            }
        }
        return b;
    }
}
