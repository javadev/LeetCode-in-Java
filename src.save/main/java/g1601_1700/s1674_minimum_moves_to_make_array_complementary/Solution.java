package g1601_1700.s1674_minimum_moves_to_make_array_complementary;

// #Medium #Array #Hash_Table #Prefix_Sum #Acceptance_37.4%
// #2022_04_19_Time_29_ms_(22.22%)_Space_96.3_MB_(14.29%)

public class Solution {
    public int minMoves(int[] nums, int limit) {
        int[] cnt = new int[limit * 2 + 1];
        int[] min = new int[limit * 2 + 1];
        int[] max = new int[limit * 2 + 2];
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) {
            cnt[nums[i] + nums[n - i - 1]]++;
            min[Math.min(nums[i], nums[n - i - 1])]++;
            max[Math.max(nums[i], nums[n - i - 1]) + limit + 1]++;
        }
        for (int i = limit * 2 - 1; i >= 2; i--) {
            min[i] += min[i + 1];
        }
        for (int i = 3; i < limit * 2 + 1; i++) {
            max[i] += max[i - 1];
        }
        for (int i = 2; i < limit * 2 + 1; i++) {
            res = Math.min(res, n / 2 - cnt[i] + min[i] + max[i]);
        }
        return res;
    }
}
