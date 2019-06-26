package com.cx.leetcode;

import java.util.HashMap;

public class TwoSum {
//    public int[] twoSum(int[] numbers, int target){
//        int[] result = new int[2];
//
//        return result;
//    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int pt = res.getOrDefault(target - nums[i], -1);
            if (pt >= 0)
                return new int[]{pt, i};

            res.put(nums[i], i);
        }
        return null;
    }
}
