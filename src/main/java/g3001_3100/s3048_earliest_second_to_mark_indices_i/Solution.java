package g3001_3100.s3048_earliest_second_to_mark_indices_i;

// #Medium #Array #Binary_Search #2024_03_04_Time_2_ms_(91.18%)_Space_44.6_MB_(92.63%)

import java.util.Arrays;

public class Solution {
    public int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
        int n = nums.length;
        if (nums.length == 0 || changeIndices.length == 0) {
            return 0;
        }
        int[] last = new int[n];
        Arrays.fill(last, -1);
        for (int i = 0; i < changeIndices.length; i++) {
            changeIndices[i] -= 1;
        }
        int low = 0;
        int high = changeIndices.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isPossible(mid, nums, changeIndices, last)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return isPossible(low, nums, changeIndices, last) ? low + 1 : -1;
    }

    private boolean isPossible(int s, int[] nums, int[] changeIndices, int[] last) {
        int n = nums.length;
        Arrays.fill(last, -1);
        for (int i = 0; i <= s; i++) {
            last[changeIndices[i]] = i;
        }
        int marked = 0;
        int operations = 0;
        for (int i = 0; i <= s; i++) {
            if (i == last[changeIndices[i]]) {
                if (nums[changeIndices[i]] > operations) {
                    return false;
                }
                operations -= nums[changeIndices[i]];
                marked++;
            } else {
                operations++;
            }
        }
        return marked == n;
    }
}
