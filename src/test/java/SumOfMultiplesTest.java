import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumOfMultiplesTest {

    @Test
    void basicTests() {
        assertEquals(20, SumOfMultiples.sumMul(2, 9), "n = 2, m = 9");
        assertEquals(30, SumOfMultiples.sumMul(5, 20), "n = 5, m = 20");
        assertEquals(1860, SumOfMultiples.sumMul(4, 123), "n = 4, m = 123");
        assertEquals(86469, SumOfMultiples.sumMul(123, 4567), "n = 123, m = 4567");
    }

    @Test
    void invalidTests() {
        assertThrows(IllegalArgumentException.class, () -> SumOfMultiples.sumMul(0, 0), "n = 0, m = 0");
        assertThrows(IllegalArgumentException.class, () -> SumOfMultiples.sumMul(4, -7), "n = 4, m = -7");
        assertThrows(IllegalArgumentException.class, () -> SumOfMultiples.sumMul(-3, 10), "n = -3, m = 10");
    }
}
