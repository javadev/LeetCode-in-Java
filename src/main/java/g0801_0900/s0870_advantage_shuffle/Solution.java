package g0801_0900.s0870_advantage_shuffle;

// #Medium #Array #Sorting #Greedy #2024_12_19_Time_42_ms_(99.16%)_Space_56.1_MB_(94.94%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int[] result = new int[nums1.length];
        int low = 0;
        boolean[] chosen = new boolean[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            int pos = binSearch(nums1, nums2[i], low, chosen);
            if (pos != -1 && pos < nums1.length) {
                result[i] = nums1[pos];
                chosen[pos] = true;
            } else {
                result[i] = -1;
            }
        }
        List<Integer> pos = new ArrayList<>();
        int i = 0;
        for (boolean ch : chosen) {
            if (!ch) {
                pos.add(i);
            }
            i++;
        }
        int index = 0;
        for (i = 0; i < result.length; i++) {
            if (result[i] == -1) {
                result[i] = nums1[pos.get(index)];
                index++;
            }
        }
        return result;
    }

    private int binSearch(int[] nums, int target, int low, boolean[] chosen) {
        int high = nums.length - 1;
        while (high >= low) {
            int mid = high - (high - low) / 2;
            if (nums[mid] > target && (mid == 0 || nums[mid - 1] <= target)) {
                while (mid < nums.length && chosen[mid]) {
                    mid++;
                }
                return mid;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
