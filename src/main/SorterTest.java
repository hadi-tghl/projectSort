package main;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SorterTest {

    @Test
    void selctSort1() {
        int[] in = {-2, 10, 3, 6, 15, -13};
        int[] result = {-13, -2, 3, 6, 10, 15};

        Assertions.assertArrayEquals(in, result);
    }

}
