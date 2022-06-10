package AddBinary67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    public void testAddZeros(){
        assertEquals("0", AddBinary.addBinary("0", "0"));
    }

    @Test
    public void testAddOnes(){
        assertEquals("10", AddBinary.addBinary("1", "1"));
    }

    @Test
    public void testLongCarry(){
        assertEquals("1000010", AddBinary.addBinary("111100", "110"));
    }
}