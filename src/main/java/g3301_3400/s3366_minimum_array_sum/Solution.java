package g3301_3400.s3366_minimum_array_sum;

// #Medium #Array #Dynamic_Programming #2024_12_03_Time_4_ms_(99.77%)_Space_43_MB_(99.69%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        Arrays.sort(nums);
        int high = lowerBound(nums, k * 2 - 1);
        int low = lowerBound(nums, k);
        int n = nums.length;
        for (int i = n - 1; i >= high; i--) {
            if (op1 > 0) {
                nums[i] = (nums[i] + 1) / 2;
                op1--;
            }
            if (op2 > 0) {
                nums[i] -= k;
                op2--;
            }
        }
        Map<Integer, Integer> count = new HashMap<>();
        int odd = 0;
        for (int i = low; i < high; i++) {
            if (op2 > 0) {
                nums[i] -= k;
                if (k % 2 > 0 && nums[i] % 2 > 0) {
                    count.merge(nums[i], 1, Integer::sum);
                }
                op2--;
            } else {
                odd += nums[i] % 2;
            }
        }
        Arrays.sort(nums, 0, high);
        int ans = 0;
        if (k % 2 > 0) {
            for (int i = high - op1; i < high && odd > 0; i++) {
                int x = nums[i];
                if (count.containsKey(x)) {
                    if (count.merge(x, -1, Integer::sum) == 0) {
                        count.remove(x);
                    }
                    odd--;
                    ans--;
                }
            }
        }
        for (int i = high - 1; i >= 0 && op1 > 0; i--, op1--) {
            nums[i] = (nums[i] + 1) / 2;
        }
        for (int x : nums) {
            ans += x;
        }
        return ans;
    }

    private int lowerBound(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}
