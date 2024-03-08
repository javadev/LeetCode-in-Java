package g1501_1600.s1535_find_the_winner_of_an_array_game;

// #Medium #Array #Simulation #2022_04_10_Time_1_ms_(86.99%)_Space_79.8_MB_(41.78%)

public class Solution {
    public int getWinner(int[] arr, int k) {
        int winner = arr[0];
        int winTimes = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > winner) {
                winner = arr[i];
                winTimes = 1;
            } else {
                winTimes++;
            }
            if (winTimes >= k) {
                return winner;
            }
        }
        return winner;
    }
}
