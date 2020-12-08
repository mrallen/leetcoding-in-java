package org.example.leetcoding.easy.palindromenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        int input = 0;
        boolean expected = true;

        boolean actual = objectUnderTest.isPalindrome(input);

        assertEquals(expected, actual);

    }

    @Test
    void test_2() {
        int input = -1;
        boolean expected = false;

        boolean actual = objectUnderTest.isPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int input = 9;
        boolean expected = true;

        boolean actual = objectUnderTest.isPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int input = 10;
        boolean expected = false;

        boolean actual = objectUnderTest.isPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int input = 1001;
        boolean expected = true;

        boolean actual = objectUnderTest.isPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        int input = 1000021;
        boolean expected = false;

        boolean actual = objectUnderTest.isPalindrome(input);

        assertEquals(expected, actual);
    }
}