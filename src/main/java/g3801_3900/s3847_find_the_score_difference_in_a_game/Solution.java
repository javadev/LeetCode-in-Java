package g3801_3900.s3847_find_the_score_difference_in_a_game;

// #Medium #Array #Simulation #Senior #Weekly_Contest_490
// #2026_07_22_Time_1_ms_(100.00%)_Space_46.89_MB_(71.53%)

public class Solution {
    public int scoreDifference(int[] nums) {
        int player = 0;
        int[] scores = new int[] {0, 0};
        for (int game = 1; game <= nums.length; ++game) {
            player ^= ((nums[game - 1] % 2) ^ ((game % 6 == 0) ? 1 : 0));
            scores[player] += nums[game - 1];
        }
        return scores[0] - scores[1];
    }
}
