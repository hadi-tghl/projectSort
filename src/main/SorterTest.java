package main;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SorterTest {

    @Test
    void selectSort1() {
        int[] in = {-2, 10, 3, 6, 15, -13};
        int[] result = {-13, -2, 3, 6, 10, 15};

        Assertions.assertArrayEquals(result, Sorter.selectSort(in));
    }

    @Test
    void selectSort2() {
        int[] in = {5, 2, 8, 1, 7, 3};
        int[] result = {1, 2, 3, 5, 7, 8};

        Assertions.assertArrayEquals(result, Sorter.selectSort(in));
    }

    @Test
    void selectSort3() {
        // Test an already sorted array
        int[] in = {1, 2, 3, 4, 5};
        int[] result = {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(result, Sorter.selectSort(in));
    }

    @Test
    void selectSort4() {
        // Test an array with duplicate elements
        int[] in = {5, 2, 8, 1, 7, 3, 1, 8};
        int[] result = {1, 1, 2, 3, 5, 7, 8, 8};

        Assertions.assertArrayEquals(result, Sorter.selectSort(in));
    }

    @Test
    void selectSort5() {
        // Test an empty array
        int[] in = {};
        int[] result = {};

        Assertions.assertArrayEquals(result, Sorter.selectSort(in));
    }

    @Test
    void selectSort6() {
        // Test an array with a single element
        int[] in = {42};
        int[] result = {42};

        Assertions.assertArrayEquals(result, Sorter.selectSort(in));
    }
}
