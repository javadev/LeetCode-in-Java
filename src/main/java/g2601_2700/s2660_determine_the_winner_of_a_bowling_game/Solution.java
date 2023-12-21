package g2601_2700.s2660_determine_the_winner_of_a_bowling_game;

// #Easy #Array #Simulation #2023_09_07_Time_1_ms_(100.00%)_Space_43.5_MB_(91.46%)

public class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int p1Score = 0;
        int p2Score = 0;
        int isTen = 0;
        for (int score : player1) {
            p1Score += (isTen > 0) ? 2 * score : score;
            if (isTen > 0) {
                isTen--;
            }
            if (score == 10) {
                isTen = 2;
            }
        }
        isTen = 0;
        for (int score : player2) {
            p2Score += (isTen > 0) ? 2 * score : score;
            if (isTen > 0) {
                isTen--;
            }
            if (score == 10) {
                isTen = 2;
            }
        }
        if (p1Score == p2Score) {
            return 0;
        } else if (p1Score > p2Score) {
            return 1;
        } else {
            return 2;
        }
    }
}
