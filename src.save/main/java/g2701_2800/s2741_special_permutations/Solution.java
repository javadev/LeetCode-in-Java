package g2701_2800.s2741_special_permutations;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2023_09_23_Time_105_ms_(96.58%)_Space_49.6_MB_(55.48%)

public class Solution {
    private int n;
    private Integer[][] memo;
    private int[] nums;

    public int specialPerm(int[] nums) {
        this.n = nums.length;
        this.memo = new Integer[n][1 << n];
        this.nums = nums;
        return backtrack(0, 0);
    }

    private int backtrack(int preIndex, int mask) {
        if (mask == (1 << n) - 1) {
            return 1;
        }
        if (memo[preIndex][mask] != null) {
            return memo[preIndex][mask];
        }
        int count = 0;
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) == 0
                    && (mask == 0
                            || nums[i] % nums[preIndex] == 0
                            || nums[preIndex] % nums[i] == 0)) {
                count = (count + backtrack(i, mask | (1 << i))) % mod;
            }
        }
        memo[preIndex][mask] = count;
        return memo[preIndex][mask];
    }
}
