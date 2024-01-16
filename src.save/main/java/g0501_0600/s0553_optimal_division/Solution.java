package g0501_0600.s0553_optimal_division;

// #Medium #Array #Dynamic_Programming #Math #2022_08_03_Time_0_ms_(100.00%)_Space_42.3_MB_(46.15%)

public class Solution {
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        if (nums.length == 1) {
            sb.append(nums[0]);
            return sb.toString();
        }
        if (nums.length == 2) {
            sb.append(nums[0]);
            sb.append("/");
            sb.append(nums[1]);
            return sb.toString();
        }
        sb.append(nums[0]);
        sb.append("/");
        sb.append("(");
        for (int i = 1; i < nums.length - 1; i++) {
            sb.append(nums[i]);
            sb.append('/');
        }
        sb.append(nums[nums.length - 1]);
        sb.append(")");
        return sb.toString();
    }
}
