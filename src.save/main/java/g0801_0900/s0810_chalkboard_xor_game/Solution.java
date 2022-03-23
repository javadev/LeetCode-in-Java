package g0801_0900.s0810_chalkboard_xor_game;

// #Hard #Array #Math #Bit_Manipulation #Game_Theory #Brainteaser
// #2022_03_23_Time_0_ms_(100.00%)_Space_41.6_MB_(95.74%)

public class Solution {
    public boolean xorGame(int[] nums) {
        int xor = 0;
        for (int i : nums) {
            xor = xor ^ i;
        }
        return xor == 0 || (nums.length & 1) == 0;
    }
}
