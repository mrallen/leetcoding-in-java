package org.example.leetcoding.easy.removeduplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        int[] input = new int[]{1, 1, 2};
        int expected = 2;

        int actual = objectUnderTest.removeDuplicates(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] input = new int[]{0,0,1,1,1,2,2,3,3,4};
        int expected = 5;

        int actual = objectUnderTest.removeDuplicates(input);

        assertEquals(expected, actual);
    }

}