package org.example.leetcoding.easy.plusone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        int[] input = new int[]{ 1, 2, 3 };
        int[] expected = new int[]{ 1, 2, 4 };

        int[] actual = objectUnderTest.plusOne(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] input = new int[]{ 4, 3, 2, 1 };
        int[] expected = new int[]{ 4, 3, 2, 2};

        int[] actual = objectUnderTest.plusOne(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] input = new int[]{0};
        int[] expected = new int[]{1};

        int[] actual = objectUnderTest.plusOne(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] input = new int[]{9};
        int[] expected = new int[]{1, 0};

        int[] actual = objectUnderTest.plusOne(input);

        assertArrayEquals(expected, actual);
    }

}