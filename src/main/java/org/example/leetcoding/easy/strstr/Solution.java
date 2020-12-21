package org.example.leetcoding.easy.strstr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return 0;
        } else {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
