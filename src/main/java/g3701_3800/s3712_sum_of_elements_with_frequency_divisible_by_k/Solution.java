package g3701_3800.s3712_sum_of_elements_with_frequency_divisible_by_k;

// #Easy #Weekly_Contest_471 #2025_10_13_Time_1_ms_(99.96%)_Space_42.21_MB_(100.00%)

public class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int[] cnt = new int[max + 1];
        for (int num : nums) {
            cnt[num]++;
        }
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] != 0 && cnt[i] % k == 0) {
                sum += i * cnt[i];
            }
        }
        return sum;
    }
}
