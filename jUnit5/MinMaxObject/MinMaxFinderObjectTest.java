import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxFinderObjectTest {

    MinMaxFinderObject o;
    @Test
    void findMinMax() {
        o=new MinMaxFinderObject();
        assertAll(
                ()->assertEquals("2 99",o.findMinMax(new int[]{89,2,56,43,99})),
                ()->assertEquals("-1 9",o.findMinMax(new int[]{5,6,0,7,-1,8,9})),
                ()->assertEquals("0 15",o.findMinMax(new int[]{15, 8, 5, 3, 0})),
                ()->assertEquals("42 69",o.findMinMax(new int[]{55,65,54,59,62,42,69})));
    }
}