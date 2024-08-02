package g3201_3300.s3232_find_if_digit_game_can_be_won;

// #Easy #Array #Math #2024_08_02_Time_0_ms_(100.00%)_Space_43.5_MB_(99.62%)

public class Solution {
    public boolean canAliceWin(int[] nums) {
        int sdSum = 0;
        int ddSum = 0;
        for (int num : nums) {
            if (num / 10 == 0) {
                sdSum += num;
            } else {
                ddSum += num;
            }
        }
        return sdSum != ddSum;
    }
}
