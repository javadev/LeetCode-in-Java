package g3101_3200.s3175_find_the_first_player_to_win_k_games_in_a_row;

// #Medium #Array #Simulation #2024_06_12_Time_1_ms_(100.00%)_Space_60.4_MB_(70.11%)

public class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length;
        int max = skills[0];
        int cnt = 0;
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (skills[i] > max) {
                max = skills[i];
                cnt = 0;
                res = i;
            }
            cnt += 1;
            if (cnt == k) {
                break;
            }
        }
        return res;
    }
}
