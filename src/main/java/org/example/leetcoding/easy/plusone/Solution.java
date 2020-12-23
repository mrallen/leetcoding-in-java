package org.example.leetcoding.easy.plusone;

public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i] += 1;
        while (i >= 1 && digits[i] == 10) {
            digits[i] = 0;
            digits[i - 1] += 1;
            i--;
        }
        if (i == 0 && digits[i] == 10) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}
