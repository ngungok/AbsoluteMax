package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaxTest {
    
    @Test
    public void testFindMaxValue(){
        assertEquals(12, FindMax.findMax(new int[] {1,2,3,4,5,6,12,8,9,10}));
    }
}
