import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetCharASCIITest {
    @Test
    public void testChar() {
        assertEquals('7', GetCharASCII.getChar(55));
        assertEquals('8', GetCharASCII.getChar(56));
        assertEquals('9', GetCharASCII.getChar(57));
        assertEquals(':', GetCharASCII.getChar(58));
        assertEquals(';', GetCharASCII.getChar(59));
        assertEquals('<', GetCharASCII.getChar(60));
        assertEquals('=', GetCharASCII.getChar(61));
        assertEquals('>', GetCharASCII.getChar(62));
        assertEquals('?', GetCharASCII.getChar(63));
        assertEquals('@', GetCharASCII.getChar(64));
        assertEquals('A', GetCharASCII.getChar(65));
        assertEquals("getChar should return a `char`", 0, Character.compare('!', GetCharASCII.getChar(33)));
    }
}
