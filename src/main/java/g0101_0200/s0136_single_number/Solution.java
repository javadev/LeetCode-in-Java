package g0101_0200.s0136_single_number;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Bit_Manipulation
// #Data_Structure_II_Day_1_Array #Algorithm_I_Day_14_Bit_Manipulation #Udemy_Integers
// #Top_Interview_150_Bit_Manipulation #Big_O_Time_O(N)_Space_O(1)
// #2024_11_13_Time_1_ms_(99.86%)_Space_46_MB_(49.33%)

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
