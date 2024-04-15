package g2001_2100.s2023_number_of_pairs_of_strings_with_concatenation_equal_to_target;

// #Medium #Array #String #2022_05_25_Time_36_ms_(36.00%)_Space_42.8_MB_(69.54%)

public class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    String con = nums[i] + nums[j];
                    if (con.equals(target)) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
