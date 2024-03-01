package g1601_1700.s1695_maximum_erasure_value;

// #Medium #Array #Hash_Table #Sliding_Window #2022_04_13_Time_5_ms_(99.82%)_Space_53.3_MB_(92.02%)

public class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        int sum = 0;
        boolean[] seen = new boolean[10001];
        int j = 0;
        for (int num : nums) {
            while (seen[num]) {
                seen[nums[j]] = false;
                sum -= nums[j++];
            }
            seen[num] = true;
            sum += num;
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
