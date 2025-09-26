package g3601_3700.s3684_maximize_sum_of_at_most_k_distinct_elements;

// #Easy #Array #Hash_Table #Sorting #Greedy #Weekly_Contest_467
// #2025_09_26_Time_3_ms_(99.92%)_Space_45.48_MB_(84.34%)

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
        System.arraycopy(arr, 0, finl, 0, cnt);
        return finl;
    }
}
