package DefangingAnIPAddress1108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DefangingAnIPAddressTest {
    @Test
    public void testDefang(){
        assertTrue(DefangingAnIPAddress.defangIPaddr("1.1.1.1").equals("1[.]1[.]1[.]1"));
    }

    @Test
    public void testDefangExpectedAnswer(){
        assertTrue(DefangingAnIPAddress.defangIPaddrExpectedAnswer("1.1.1.1").equals("1[.]1[.]1[.]1"));
    }

    @Test
    public void testDefangCleaner(){
        assertTrue(DefangingAnIPAddress.defangIPaddrCleaner("1.1.1.1").equals("1[.]1[.]1[.]1"));
    }
}