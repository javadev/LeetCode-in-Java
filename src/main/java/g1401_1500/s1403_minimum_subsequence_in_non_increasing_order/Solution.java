package g1401_1500.s1403_minimum_subsequence_in_non_increasing_order;

// #Easy #Array #Sorting #Greedy #2022_03_25_Time_4_ms_(79.60%)_Space_45.7_MB_(11.33%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int sumOfNonIncludedElements = nums[0];
        int sumOfIncludedElements = nums[endIndex];
        List<Integer> result = new ArrayList<>();
        while (startIndex < endIndex) {
            if (sumOfNonIncludedElements < sumOfIncludedElements) {
                sumOfNonIncludedElements += nums[++startIndex];
            } else {
                result.add(nums[endIndex]);
                sumOfIncludedElements += nums[--endIndex];
            }
        }
        result.add(nums[startIndex]);
        return result;
    }
}
