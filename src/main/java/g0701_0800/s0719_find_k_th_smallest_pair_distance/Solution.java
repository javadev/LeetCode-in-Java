package g0701_0800.s0719_find_k_th_smallest_pair_distance;

// #Hard #Array #Sorting #Binary_Search #Two_Pointers
// #2022_03_24_Time_8_ms_(81.40%)_Space_44.6_MB_(48.69%)

import java.util.Arrays;

public class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int length = nums.length;
        int maxDiff = nums[length - 1] - nums[0];
        int start = 0;
        int end = maxDiff;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isPair(nums, mid, k)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean isPair(int[] nums, int mid, int k) {
        int count = 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            while (nums[j] - nums[i] > mid) {
                i++;
            }
            count += j - i;
        }
        return (count >= k);
    }
}
