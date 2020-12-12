package org.example.leetcoding.easy.longestcommonprefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        String[] input = new String[]{ "flower", "flow", "flight" };
        String expected = "fl";

        String actual = objectUnderTest.longestCommonPrefix(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String[] input = new String[]{ "dog", "racecar", "car" };
        String expected = "";

        String actual = objectUnderTest.longestCommonPrefix(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String[] input = new String[]{};
        String expected = "";

        String actual = objectUnderTest.longestCommonPrefix(input);

        assertEquals(expected, actual);
    }

}