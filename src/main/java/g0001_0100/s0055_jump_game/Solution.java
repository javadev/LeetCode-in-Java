package g0001_0100.s0055_jump_game;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming #Greedy
// #Algorithm_II_Day_12_Dynamic_Programming #Dynamic_Programming_I_Day_4 #Udemy_Arrays
// #Top_Interview_150_Array/String #Big_O_Time_O(n)_Space_O(1)
// #2024_11_11_Time_1_ms_(100.00%)_Space_45.6_MB_(44.48%)

public class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        if (nums[0] == 0) {
            return false;
        }
        int fin = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if ((nums[i] + i) >= fin) {
                fin = i;
            }
        }
        return fin == 0;
    }
}
