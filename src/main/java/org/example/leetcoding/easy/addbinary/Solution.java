package org.example.leetcoding.easy.addbinary;

public class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;

        for (/**/; i >= 0 || j >= 0; i--, j--) {
            int ai = i >= 0 ? Integer.parseInt(String.valueOf(a.charAt(i))) : 0;
            int bj = j >= 0 ? Integer.parseInt(String.valueOf(b.charAt(j))) : 0;
            int v = ai + bj + carry;
            sb.append(v % 2 == 0 ? '0' : '1');
            carry = v >= 2 ? 1 : 0;
        }
        if (carry == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
