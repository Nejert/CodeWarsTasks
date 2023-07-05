/**
 * <p>If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.</p>
 * <p>Finish the solution so that it returns the sum of all the multiples of 3 or 5 <strong>below</strong> the number passed in.
 * Additionally, if the number is negative, return 0 (for languages that do have them).</p>
 * <p><strong>Note:</strong> If the number is a multiple of <strong>both</strong> 3 and 5, only count it <em>once</em>.</p>
 * <p><em><strong>Courtesy of projecteuler.net</strong> (<a href="https://projecteuler.net/problem=1">Problem 1</a>)</em></p>
 */
public class MultiplesOf3Or5 {
    public int solution(int number) {
        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new MultiplesOf3Or5().solution(10));
    }
}
