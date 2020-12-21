package org.example.leetcoding.easy.removeelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        int[] input = new int[]{3, 2, 2, 3};
        int val = 3;
        int expected = 2;

        int actual = objectUnderTest.removeElement(input, val);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] input = new int[]{0, 1, 2, 2, 4, 0, 3, 2};
        int val = 2;
        int expected = 5;

        int actual = objectUnderTest.removeElement(input, val);

        assertEquals(expected, actual);
    }

}