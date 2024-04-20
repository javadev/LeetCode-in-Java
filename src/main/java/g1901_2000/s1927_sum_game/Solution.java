package g1901_2000.s1927_sum_game;

// #Medium #Math #Greedy #Game_Theory #2022_05_14_Time_13_ms_(34.41%)_Space_43.1_MB_(80.65%)

public class Solution {
    public boolean sumGame(String num) {
        int count = 0;
        int diff = 0;
        int l = num.length();
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '?') {
                count += i < l / 2 ? 1 : -1;
            } else {
                if (i < l / 2) {
                    diff += num.charAt(i) - '0';
                } else {
                    diff -= num.charAt(i) - '0';
                }
            }
        }
        return diff * 2 != -9 * count;
    }
}
