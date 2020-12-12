package org.example.leetcoding.easy.validparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        String input = "()";
        boolean expected = true;

        boolean actual = objectUnderTest.isValid(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String input = "()[]{}";
        boolean expected = true;

        boolean actual = objectUnderTest.isValid(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String input = "(]";
        boolean expected = false;

        boolean actual = objectUnderTest.isValid(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String input = "([)]";
        boolean expected = false;

        boolean actual = objectUnderTest.isValid(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String input = "{[]}";
        boolean expected = true;

        boolean actual = objectUnderTest.isValid(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        String input = "{[]}}";
        boolean expected = false;

        boolean actual = objectUnderTest.isValid(input);

        assertEquals(expected, actual);
    }
}