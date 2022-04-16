package PascalsTriangle118;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    @Test
    public void testRow1(){
        assertEquals("[[1]]", PascalsTriangle.generate(1).toString());
    }

    @Test
    public void testRow5(){
        assertEquals("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]", PascalsTriangle.generate(5).toString());
    }
}