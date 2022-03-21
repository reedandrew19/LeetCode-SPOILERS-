package ContainsDuplicate217;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {
    @Test
    public void testOnlyDuplicate(){
        assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 1}));
    }

    @Test
    public void testEmptyArray(){
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{}));
    }

    @Test
    public void testSingleValueArray(){
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{4}));
    }

    @Test
    public void testContainsNoDuplicate(){
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{54,-25, 0}));
    }

    @Test
    public void testContainsDuplicate(){
        assertTrue(ContainsDuplicate.containsDuplicate(new int[]{6, 36, 83, 35, 36, 44, 100000}));
    }
}