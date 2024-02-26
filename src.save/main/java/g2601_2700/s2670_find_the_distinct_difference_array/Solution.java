package g2601_2700.s2670_find_the_distinct_difference_array;

// #Easy #Array #Hash_Table #2023_09_10_Time_5_ms_(92.12%)_Space_44.5_MB_(66.07%)

import java.util.HashSet;

public class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        HashSet<Integer> prefixSet = new HashSet<>();
        HashSet<Integer> suffixSet = new HashSet<>();
        int[] preList = new int[n];
        int[] sufList = new int[n];
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            prefixSet.add(nums[i]);
            suffixSet.add(nums[n - 1 - i]);
            preList[i] = prefixSet.size();
            sufList[n - 1 - i] = suffixSet.size();
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                ans[i] = preList[i];
            } else {
                ans[i] = preList[i] - sufList[i + 1];
            }
        }
        return ans;
    }
}
