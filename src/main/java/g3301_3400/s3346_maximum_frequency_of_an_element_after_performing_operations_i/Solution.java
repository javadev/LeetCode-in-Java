package g3301_3400.s3346_maximum_frequency_of_an_element_after_performing_operations_i;

// #Medium #2024_11_12_Time_7_ms_(96.72%)_Space_57.4_MB_(44.86%)

public class Solution {
    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(num, max);
        }
        return max;
    }

    public int maxFrequency(int[] nums, int k, int numOperations) {
        int maxNum = getMax(nums);
        int n = maxNum + k + 2;
        int[] freq = new int[n];
        for (int num : nums) {
            freq[num]++;
        }
        int[] pref = new int[n];
        pref[0] = freq[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + freq[i];
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - k);
            int right = Math.min(n - 1, i + k);
            int tot = pref[right];
            if (left > 0) {
                tot -= pref[left - 1];
            }
            res = Math.max(res, freq[i] + Math.min(numOperations, tot - freq[i]));
        }
        return res;
    }
}
