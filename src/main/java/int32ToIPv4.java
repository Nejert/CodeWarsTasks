/**
 * <p>Take the following IPv4 address: <code>128.32.10.1</code></p>
 * <p>This address has 4 octets where each octet is a single byte (or 8 bits).</p>
 * <ul>
 * <li>1st octet <code>128</code> has the binary representation: <code>10000000</code></li>
 * <li>2nd octet <code>32</code> has the binary representation: <code>00100000</code></li>
 * <li>3rd octet <code>10</code> has the binary representation: <code>00001010</code></li>
 * <li>4th octet <code>1</code> has the binary representation: <code>00000001</code></li>
 * </ul>
 * <p>So <pre>{@code 128.32.10.1 == 10000000.00100000.00001010.00000001}</pre></p>
 * <p>Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: <code>2149583361</code></p>
 * <p>Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.</p>
 * <h4>Examples</h4>
 * <pre>{@code 2149583361 ==> "128.32.10.1"
 * 32         ==> "0.0.0.32"
 * 0          ==> "0.0.0.0"
 * }</pre>
 */
public class int32ToIPv4 {
    public static String longToIP(long ip) {
        long octet1 = ip >>> 24;
        long octet2 = ((octet1 << 24) ^ ip) >>> 16;
        long octet3 = (((octet1 << 24) + (octet2 << 16)) ^ ip) >>> 8;
        long octet4 = ((octet1 << 24) + (octet2 << 16) + (octet3 << 8)) ^ ip;
        return String.format("%d.%d.%d.%d", octet1, octet2, octet3, octet4);
    }

    public static void main(String[] args) {//128.32.10.1
        System.out.println(Integer.toBinaryString(Integer.parseUnsignedInt("2149583361")));
        long t = 2149583361L;
        long octet1 = t >>> 24;
        long octet2 = ((octet1 << 24) ^ t) >>> 16;
        long octet3 = (((octet1 << 24) + (octet2 << 16)) ^ t) >>> 8;
        long octet4 = ((octet1 << 24) + (octet2 << 16) + (octet3 << 8)) ^ t;
        System.out.println((long) 0b10000000_00100000_00001010_00000001);
        System.out.println();
        System.out.println(Long.toBinaryString(t));
        System.out.println(Long.toBinaryString(octet1) + " " + (octet1));
        System.out.println(Long.toBinaryString(octet2) + " " + (octet2));
        System.out.println(Long.toBinaryString(octet3) + " " + (octet3));
        System.out.println(Long.toBinaryString(octet4) + " " + (octet4));
        System.out.println(octet1 + "." + octet2 + "." + octet3 + "." + octet4);
        System.out.println(Long.toBinaryString(((t >> 16))));
    }
}
