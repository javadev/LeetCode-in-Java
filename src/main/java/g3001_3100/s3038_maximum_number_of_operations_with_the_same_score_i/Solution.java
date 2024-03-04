package g3001_3100.s3038_maximum_number_of_operations_with_the_same_score_i;

// #Easy #Array #Simulation #2024_03_04_Time_0_ms_(100.00%)_Space_41.5_MB_(92.21%)

public class Solution {
    public int maxOperations(int[] nums) {
        int c = 1;
        for (int i = 2, s = nums[0] + nums[1], l = nums.length - (nums.length % 2 == 0 ? 0 : 1);
                i < l;
                i += 2) {
            if (nums[i] + nums[i + 1] == s) {
                c++;
            } else {
                break;
            }
        }
        return c;
    }
}
