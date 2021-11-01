package s0045_jump_game_ii;

public class Solution {
    public int jump(int[] nums) {
        int length = 0;
        int maxLength = 0;
        int minJump = 0;

        for (int i = 0; i < nums.length - 1; ++i) {
            length--;
            maxLength--;

            maxLength = Math.max(maxLength, nums[i]);

            if (length <= 0) {
                length = maxLength;
                minJump++;
            }

            if (length >= nums.length - i - 1) {
                return minJump;
            }
        }

        return minJump;
    }
}
