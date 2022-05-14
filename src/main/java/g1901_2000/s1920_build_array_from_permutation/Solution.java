package g1901_2000.s1920_build_array_from_permutation;

// #Easy #Array #Simulation #2022_05_14_Time_1_ms_(94.23%)_Space_54.1_MB_(13.18%)

public class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
