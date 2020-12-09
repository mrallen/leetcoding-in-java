package org.example.leetcoding.easy.romantointeger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        String input = "III";
        int expected = 3;

        int actual = objectUnderTest.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String input = "IV";
        int expected = 4;

        int actual = objectUnderTest.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String input = "IX";
        int expected = 9;

        int actual = objectUnderTest.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String input = "LVIII";
        int expected = 58;

        int actual = objectUnderTest.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String input = "MCMXCIV";
        int expected = 1994;

        int actual = objectUnderTest.romanToInt(input);

        assertEquals(expected, actual);
    }
}