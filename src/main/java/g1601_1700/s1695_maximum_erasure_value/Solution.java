package g1601_1700.s1695_maximum_erasure_value;

// #Medium #Array #Hash_Table #Sliding_Window #2022_04_13_Time_5_ms_(99.82%)_Space_53.3_MB_(92.02%)

public class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        int sum = 0;
        boolean[] seen = new boolean[10001];
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            while (seen[nums[i]]) {
                seen[nums[j]] = false;
                sum -= nums[j++];
            }
            seen[nums[i]] = true;
            sum += nums[i];
            ans = Math.max(sum, ans);
            i++;
        }
        return ans;
    }
}
