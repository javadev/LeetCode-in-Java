package g0901_1000.s0920_number_of_music_playlists;

// #Hard #Dynamic_Programming #Math #Combinatorics
// #2022_03_29_Time_2_ms_(96.55%)_Space_43.2_MB_(25.12%)

import java.util.Arrays;

public class Solution {
    public int numMusicPlaylists(int n, int l, int k) {
        long[][] dp = new long[l][n + 1];
        for (int i = 0; i < l; i++) {
            Arrays.fill(dp[i], -1);
        }
        return (int) helper(0, l, 0, n, k, dp);
    }

    private long helper(int songNumber, int l, int usedSong, int n, int k, long[][] dp) {
        if (songNumber == l) {
            return usedSong == n ? 1 : 0;
        }
        if (dp[songNumber][usedSong] != -1) {
            return dp[songNumber][usedSong];
        }
        long ans;
        if (songNumber < k) {
            ans = (n - usedSong) * helper(songNumber + 1, l, usedSong + 1, n, k, dp);
        } else if (usedSong == n) {
            ans = (usedSong - k) * helper(songNumber + 1, l, usedSong, n, k, dp);
        } else {
            ans =
                    (n - usedSong) * helper(songNumber + 1, l, usedSong + 1, n, k, dp)
                            + (usedSong - k) * helper(songNumber + 1, l, usedSong, n, k, dp);
        }
        int mod = (int) 1e9 + 7;
        dp[songNumber][usedSong] = ans % mod;
        return ans % mod;
    }
}
