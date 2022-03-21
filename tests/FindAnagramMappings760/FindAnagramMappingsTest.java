package FindAnagramMappings760;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Andrew on 6/3/2018.
 */
public class FindAnagramMappingsTest {
    @Test
    public void TestNoRepeats(){
        assertEquals(Arrays.toString(FindAnagramMappings.findAnagramMappings(new
                int[]{12, 28, 46, 32, 50},
                new int[]{50, 12, 32, 46, 28})),
                Arrays.toString(new int[]{1, 4, 3, 2, 0}));
    }

    @Test
    public void TestBetterNoRepeats(){
        assertEquals(Arrays.toString(FindAnagramMappings
                .findAnagramMappingBetter(new
                        int[]{12, 28, 46, 32, 50},
                new int[]{50, 12, 32, 46, 28})),
                Arrays.toString(new int[]{1, 4, 3, 2, 0}));
    }
}