import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxFinderTest {

    MinMaxFinder a;
    @Test
    void findMinMax() {
        a=new MinMaxFinder();
        assertArrayEquals(new int[]{2,99}, a.findMinMax(new int[]{89,2,56,43,99}));
        assertArrayEquals(new int[]{-1,9}, a.findMinMax(new int[]{5,6,0,7,-1,8,9}));
        assertArrayEquals(new int[]{0,15}, a.findMinMax(new int[]{15, 8, 5, 3, 0}));
        assertArrayEquals(new int[]{42,69}, a.findMinMax(new int[]{55,65,54,59,62,42,69}));
    }
}