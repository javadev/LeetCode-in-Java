package g0101_0200.s0136_single_number;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Bit_Manipulation

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
