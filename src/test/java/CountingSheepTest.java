import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingSheepTest {

    Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};
    Boolean[] array2 = {true, null, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};
    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new CountingSheep().countSheeps(array1));
    }
    @Test
    public void testNull() {
        assertEquals("There are 16 sheeps in total", 16, new CountingSheep().countSheeps(array2));
    }
}
