package org.example.leetcoding.easy.romantointeger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = getDataMap();

        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int j = i - 1;
            int c = map.get(s.charAt(i));
            result += c;
            if (j >= 0) {
                int m = map.get(s.charAt(j));
                if (m < c) {
                    result -= m;
                    i--;
                }
            }

        }
        return result;
    }

    private Map<Character, Integer> getDataMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1_000);
        return map;
    }

}
