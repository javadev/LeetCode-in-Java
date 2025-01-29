package g0001_0100.s0045_jump_game_ii;

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Greedy
// #Algorithm_II_Day_13_Dynamic_Programming #Dynamic_Programming_I_Day_4
// #Top_Interview_150_Array/String #Big_O_Time_O(n)_Space_O(1)
// #2024_11_10_Time_0_ms_(100.00%)_Space_45_MB_(64.44%)

public class Solution {
    private int getMax(int[] nums, int l, int r) {
        int max = -1;
        int curr = -1;
        for (int i = l; i <= r; i++) {
            curr = i + nums[i];
            max = Math.max(max, curr);
        }
        return max;
    }

    public int jump(int[] nums) {
        int l = 0;
        int r = 0;
        int jumps = 0;
        while (r < nums.length - 1) {
            int prev = r;
            r = getMax(nums, l, r);
            l = prev + 1;
            jumps++;
        }
        return jumps;
    }
}
