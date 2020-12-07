package org.example.leetcoding.easy.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};

        int[] actual = objectUnderTest.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] expected = {1, 2};

        int[] actual = objectUnderTest.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] nums = {3, 3};
        int target = 6;

        int[] expected = {0, 1};

        int[] actual = objectUnderTest.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }
}