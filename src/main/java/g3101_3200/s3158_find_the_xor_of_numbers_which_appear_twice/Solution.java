package g3101_3200.s3158_find_the_xor_of_numbers_which_appear_twice;

// #Easy #Array #Hash_Table #Bit_Manipulation #2024_05_30_Time_1_ms_(99.87%)_Space_42.3_MB_(99.40%)

public class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        boolean[] appeared = new boolean[51];
        int res = 0;
        for (int num : nums) {
            if (appeared[num]) {
                res ^= num;
            }
            appeared[num] = true;
        }
        return res;
    }
}
