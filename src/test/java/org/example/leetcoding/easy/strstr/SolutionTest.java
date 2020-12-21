package org.example.leetcoding.easy.strstr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        String haystack = "hello";
        String needle = "ll";

        int expected = 2;

        int actual = objectUnderTest.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String haystack = "aaaaa";
        String needle = "bba";

        int expected = -1;

        int actual = objectUnderTest.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String haystack = "";
        String needle = "";

        int expected = 0;

        int actual = objectUnderTest.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String haystack = "abc";
        String needle = "c";

        int expected = 2;

        int actual = objectUnderTest.strStr(haystack, needle);

        assertEquals(expected, actual);
    }
}