package org.example.leetcoding.easy.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        int input = 123;
        int expected = 321;

        int actual = objectUnderTest.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int input = -123;
        int expected = -321;

        int actual = objectUnderTest.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int input = 120;
        int expected = 21;

        int actual = objectUnderTest.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int input = 0;
        int expected = 0;

        int actual = objectUnderTest.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int input = 1_534_236_469;
        int expected = 0;

        int actual = objectUnderTest.reverse(input);

        assertEquals(expected, actual);
    }
}