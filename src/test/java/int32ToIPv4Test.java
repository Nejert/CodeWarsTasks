import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class int32ToIPv4Test {
    @Test
    public void sampleTest() {
        assertEquals("128.114.17.104", int32ToIPv4.longToIP(2154959208L));
        assertEquals("0.0.0.0", int32ToIPv4.longToIP(0));
        assertEquals("128.32.10.1", int32ToIPv4.longToIP(2149583361L));
    }
}
