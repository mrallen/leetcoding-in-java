package org.example.leetcoding.easy.searchinsert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        int[] nums = new int[]{ 1, 3, 5, 6 };
        int target = 5;

        int expected = 2;

        int actual = objectUnderTest.searchInsert(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = new int[]{ 1, 3, 5, 6 };
        int target = 2;

        int expected = 1;

        int actual = objectUnderTest.searchInsert(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] nums = new int[]{ 1, 3, 5, 6 };
        int target = 7;

        int expected = 4;

        int actual = objectUnderTest.searchInsert(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] nums = new int[]{ 1 };
        int target = 0;

        int expected = 0;

        int actual = objectUnderTest.searchInsert(nums, target);

        assertEquals(expected, actual);
    }
}