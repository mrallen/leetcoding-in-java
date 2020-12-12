package org.example.leetcoding.easy.longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        char c;
        while (true) {
            if (strs.length == 0 || i > strs[0].length() - 1) {
                return result.toString();
            }
            c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1 || strs[j].charAt(i) != c) {
                    return result.toString();
                }
            }
            result.append(c);
            i++;
        }
    }
}
