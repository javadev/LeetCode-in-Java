package g3201_3300.s3238_find_the_number_of_winning_players;

// #Easy #Array #Hash_Table #Counting #2024_08_06_Time_1_ms_(100.00%)_Space_44.5_MB_(99.46%)

@SuppressWarnings({"unused", "java:S1172"})
public class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] dp = new int[11][11];
        for (int[] ints : pick) {
            int p = ints[0];
            int pi = ints[1];
            dp[p][pi] += 1;
        }
        int count = 0;
        for (int i = 0; i < 11; i++) {
            boolean win = false;
            for (int j = 0; j < 11; j++) {
                if (dp[i][j] >= i + 1) {
                    win = true;
                    break;
                }
            }
            if (win) {
                count += 1;
            }
        }
        return count;
    }
}
