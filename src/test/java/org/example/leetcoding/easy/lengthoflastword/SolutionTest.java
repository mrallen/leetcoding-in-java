package org.example.leetcoding.easy.lengthoflastword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        String input = "Hello, world";
        int expected = 5;

        int actual = objectUnderTest.lengthOfLastWord(input);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String input = " ";
        int expected = 0;

        int actual = objectUnderTest.lengthOfLastWord(input);

        assertEquals(expected, actual);
    }

}