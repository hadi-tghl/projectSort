package com.company;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class SortTest {

    public class Sort extends Sorter() {
        Sorter sorter;
        // Frist test
        @Test
        void testSortInt(){
            int[] in = {-2,10,3,6,15,-13};
            int[] result = {-13,-2,3,6,10,15};

            sorter = new Sorter();
            assertTrue(Arrays.equals(in, result));

        }

        // Secoud test
        @Test
        void testSortInt1(){
            Integer[] in = {986,456,789,867,100,-100};
            Integer[] result = {-100,100,456,789,867,986};

            sorter = new Sorter();
            assertTrue(Arrays.equals(in, result));
        }
    }


}
