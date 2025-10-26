package g3701_3800.s3727_maximum_alternating_sum_of_squares;

// #Medium #Weekly_Contest_473 #2025_10_26_Time_46_ms_(100.00%)_Space_62.34_MB_(_%)

public class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int i = 0;
        int j = n - 1;
        for (int k = 0; k < n; k++) {
            nums[k] = nums[k] * nums[k];
        }
        java.util.Arrays.sort(nums);
        java.util.List<Long> ans = new java.util.ArrayList<>();
        while (i < j) {
            ans.add((long) nums[j]);
            ans.add((long) nums[i]);
            j--;
            i++;
        }
        if ((n & 1) == 1) {
            ans.add((long) nums[n / 2]);
        }
        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                sum += ans.get(k);
            } else {
                sum -= ans.get(k);
            }
        }
        return sum;
    }
}
