package g1601_1700.s1674_minimum_moves_to_make_array_complementary;

// #Medium #Array #Hash_Table #Prefix_Sum #2022_08_19_Time_12_ms_(80.39%)_Space_82.3_MB_(62.74%)

public class Solution {
    public int minMoves(int[] nums, int limit) {
        int[] delta = new int[2 * limit + 2];
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int a = nums[i];
            int b = nums[n - 1 - i];
            delta[2] += 2;
            delta[Math.min(a, b) + 1]--;
            delta[a + b]--;
            delta[a + b + 1]++;
            delta[Math.max(a, b) + limit + 1]++;
        }
        int res = 2 * n;
        int curr = 0;
        for (int i = 2; i <= 2 * limit; i++) {
            curr += delta[i];
            res = Math.min(res, curr);
        }
        return res;
    }
}
