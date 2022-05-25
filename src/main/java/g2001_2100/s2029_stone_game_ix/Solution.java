package g2001_2100.s2029_stone_game_ix;

// #Medium #Array #Math #Greedy #Counting #Game_Theory
// #2022_05_25_Time_5_ms_(100.00%)_Space_52.9_MB_(78.26%)

public class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] cnt = new int[3];
        for (int a : stones) cnt[a % 3]++;
        if (Math.min(cnt[1], cnt[2]) == 0) return Math.max(cnt[1], cnt[2]) > 2 && cnt[0] % 2 > 0;
        return Math.abs(cnt[1] - cnt[2]) > 2 || cnt[0] % 2 == 0;
    }
}
