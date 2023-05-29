import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BraceCheckerTest {

    private final BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertTrue(checker.isValid("()"));
        assertTrue(checker.isValid("(){}[]"));
        assertTrue(checker.isValid("([{}])"));
    }

    @Test
    public void testInvalid() {
        assertFalse(checker.isValid("[(])"));
        assertFalse(checker.isValid("(}"));
        assertFalse(checker.isValid("[({})](]"));
    }

}