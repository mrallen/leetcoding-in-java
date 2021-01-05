package org.example.leetcoding.easy.addbinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        String a = "11";
        String b = "1";

        String expected = "100";

        String actual = objectUnderTest.addBinary(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String a = "1010";
        String b = "1011";

        String expected = "10101";

        String actual = objectUnderTest.addBinary(a, b);

        assertEquals(expected, actual);
    }

}