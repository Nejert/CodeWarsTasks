import java.util.stream.Stream;
/**
 * A <a href=https://en.wikipedia.org/wiki/Narcissistic_number>Narcissistic Number</a> (or Armstrong Number)
 * is a positive number which is the sum of its own digits, each raised to
 * the power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).<br>
 * For example, take 153 (3 digits), which is narcissistic:
 * <pre>{@code 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153}</pre>
 * and 1652 (4 digits), which isn't:
 * <pre>{@code 1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938}</pre>
 * <h2>The Challenge:</h2>
 * Your code must {@code true} or {@code false} (not 'true' and 'false') depending upon whether the given number
 * is a Narcissistic number in base 10.<br>
 * This may be True and False in your language, e.g. PHP.<br>
 * Error checking for text strings or other invalid inputs is not required, only valid positive
 * non-zero integers will be passed into the function.
 */
public class ArmstrongNumber {
    public static boolean isNarcissistic(int number) {
        String num = String.valueOf(number);
        int exponent = num.length();
        int sum = 0;
        for (int i : Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray()) {
            sum += Math.pow(i, exponent);
        }
        return sum == number;
    }
}
