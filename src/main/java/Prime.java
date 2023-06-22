/**
 * <p>Define a function that takes an integer argument and returns a logical value <code>true</code> or <code>false</code>
 * depending on if the integer is a prime.</p>
 * <p>Per Wikipedia, a prime number ( or a prime ) is a natural number greater than <code>1</code> that has no positive
 * divisors other than <code>1</code> and itself.</p>
 * <h4>Requirements</h4>
 * <ul>
 * <li>You can assume you will be given an integer input.</li>
 * <li>You can not assume that the integer will be only positive. You may be given negative numbers as well ( or <code>0</code> ).</li>
 * <li><strong>NOTE on performance</strong>: There are no fancy optimizations required, but still <em>the</em> most trivial solutions might time out. Numbers go up to 2^31 ( or similar, depending on language ). Looping all the way up to <code>n</code>, or <code>n/2</code>, will be too slow.</li>
 * </ul>
 * <h4>Example</h4>
 * <pre>
 * {@code
 * is_prime(1)   false
 * is_prime(2)   true
 * is_prime(-1)  false}
 * </pre>
 */
public class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
