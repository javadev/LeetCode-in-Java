package g3601_3700.s3684_maximize_sum_of_at_most_k_distinct_elements;

// #Easy #Weekly_Contest_467 #2025_09_20_Time_2_ms_(100.00%)_Space_45.58_MB_(68.55%)

import java.util.Arrays;

public class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int[] arr = new int[k];
        int j = 1;
        arr[0] = nums[nums.length - 1];
        if (nums.length > 1) {
            for (int i = nums.length - 2; j < k && i >= 0; i--) {
                if (i < nums.length - 1 && nums[i] != nums[i + 1]) {
                    arr[j] = nums[i];
                    j++;
                }
            }
        }
        int cnt = 0;
        int n = 0;
        while (n < arr.length) {
            if (arr[n] != 0) {
                cnt++;
            }
            n++;
        }
        int[] finl = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            finl[i] = arr[i];
        }
        return finl;
    }
}
