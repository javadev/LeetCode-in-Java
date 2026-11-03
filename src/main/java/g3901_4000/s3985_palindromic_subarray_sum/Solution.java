package g3901_4000.s3985_palindromic_subarray_sum;

// #Hard #Array #Binary_Search #Prefix_Sum #Hash_Function #Senior_Staff #Weekly_Contest_509
// #2026_11_03_Time_13_ms_(100.00%)_Space_141.97_MB_(58.82%)

public class Solution {
    public long getSum(int[] nums) {
        long[] prefix = buildPrefixSum(nums);
        long oddMax = calculateOdd(nums, prefix);
        long evenMax = calculateEven(nums, prefix);
        return Math.max(oddMax, evenMax);
    }

    private long[] buildPrefixSum(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        return prefix;
    }

    private long calculateOdd(int[] nums, long[] prefix) {
        int n = nums.length;
        int[] d1 = new int[n];
        int l = 0;
        int r = -1;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int k = (i > r) ? 1 : Math.min(d1[l + r - i], r - i + 1);
            k = expandOdd(nums, i, k);
            d1[i] = k;
            int left = i - k + 1;
            int right = i + k - 1;
            ans = Math.max(ans, getRangeSum(prefix, left, right));
            if (right > r) {
                l = left;
                r = right;
            }
        }

        return ans;
    }

    private int expandOdd(int[] nums, int i, int k) {
        int n = nums.length;
        while (i - k >= 0 && i + k < n && nums[i - k] == nums[i + k]) {
            k++;
        }
        return k;
    }

    private long calculateEven(int[] nums, long[] prefix) {
        int n = nums.length;
        int[] d2 = new int[n];
        int l = 0;
        int r = -1;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int k = (i > r) ? 0 : Math.min(d2[l + r - i + 1], r - i + 1);
            k = expandEven(nums, i, k);
            d2[i] = k;
            if (k > 0) {
                int left = i - k;
                int right = i + k - 1;
                ans = Math.max(ans, getRangeSum(prefix, left, right));
                if (right > r) {
                    l = left;
                    r = right;
                }
            }
        }

        return ans;
    }

    private int expandEven(int[] nums, int i, int k) {
        while (i - k - 1 >= 0 && i + k < nums.length && nums[i - k - 1] == nums[i + k]) {
            k++;
        }

        return k;
    }

    private long getRangeSum(long[] prefix, int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
