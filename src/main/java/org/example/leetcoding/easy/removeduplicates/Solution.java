package org.example.leetcoding.easy.removeduplicates;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = 0;
        while (i < nums.length) {
            if (i == 0) {
                i++;
            } else {
                if (nums[i] == nums[i - 1]) {
                    i++;
                } else {
                    if (nums[j] != nums[i]) {
                        j++;
                        nums[j] = nums[i];
                        i++;
                    }
                }
            }
        }
        return j + 1;
    }
}
