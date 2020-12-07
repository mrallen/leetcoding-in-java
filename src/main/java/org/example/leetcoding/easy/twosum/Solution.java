package org.example.leetcoding.easy.twosum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) throws IllegalArgumentException {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            int t = target - c;
            if (map.containsKey(t)) {
                return new int[]{map.get(t), i};
            } else {
                map.put(c, i);
            }
        }

        throw new IllegalArgumentException("No valid answer exists.");
    }
}
