package g3001_3100.s3021_alice_and_bob_playing_flower_game;

// #Medium #Math #2024_02_29_Time_0_ms_(100.00%)_Space_40.8_MB_(25.85%)

public class Solution {
    public long flowerGame(long n, long m) {
        long ans = 0;
        ans += ((n + 1) / 2) * (m / 2) + ((m + 1) / 2) * (n / 2);
        return ans;
    }
}
