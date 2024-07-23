package g3201_3300.s3222_find_the_winning_player_in_coin_game;

// #Easy #Math #Simulation #Game_Theory #2024_07_23_Time_0_ms_(100.00%)_Space_41.6_MB_(67.81%)

public class Solution {
    public String losingPlayer(int x, int y) {
        boolean w = false;
        while (x > 0 && y >= 4) {
            x--;
            y -= 4;
            w = !w;
        }
        return w ? "Alice" : "Bob";
    }
}
