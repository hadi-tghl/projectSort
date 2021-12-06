package com.company;

import org.junit.jupiter.api.Test;

public class SortTest {

    public class Sort extends Sorter() {
        Sorter sorter;
        int[] testClass;
        int[] testResult;

        // Frist test 
        @Test
        void testSortInt(){
            Integer[] in = {-2,10,3,6,15,-13};
            Integer[] result = {-13,-2,3,6,10,15};

            sorter = new Sorter(testClass);
            assertArraysEquals(testResult, sorter.selectSort());

        }

        // Secoud test
        @Test
        void testSortInt1(){
            Integer[] in = {986,456,789,867,100,-100};
            Integer[] result = {-100,100,456,789,867,986};

            sorter = new Sorter(testClass);
            assertArraysEquals(testResult, sorter.slectSort());
        }
    }


}
