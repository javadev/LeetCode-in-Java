package g3901_4000.s3920_maximize_fixed_points_after_deletions;

// #Hard #Array #Sorting #Binary_Search #Senior_Staff #Weekly_Contest_500
// #2026_09_16_Time_19_ms_(100.00%)_Space_124.05_MB_(97.30%)

import java.util.Arrays;

public class Solution {
    public int maxFixedPoints(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= i) {
                arr[index++] = (long) i - nums[i] << 32 | nums[i];
            }
        }
        if (index == 0) {
            return 0;
        }
        Arrays.sort(arr, 0, index);
        int max = 0;
        int[] lis = new int[index];
        lis[0] = (int) arr[0];
        for (int i = 1; i < index; i++) {
            int val = (int) arr[i];
            lis[val > lis[max] ? ++max : binarySearch(lis, val, max)] = val;
        }
        return max + 1;
    }

    private int binarySearch(int[] arr, int target, int right) {
        int left = 0;
        while (left < right) {
            int mid = left + right >>> 1;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
