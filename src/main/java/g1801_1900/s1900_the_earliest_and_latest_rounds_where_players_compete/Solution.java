package g1801_1900.s1900_the_earliest_and_latest_rounds_where_players_compete;

// #Hard #Dynamic_Programming #Memoization #2022_05_01_Time_1_ms_(92.68%)_Space_42.3_MB_(51.22%)

public class Solution {
    public int[] earliestAndLatest(int n, int firstPlayer, int secondPlayer) {
        int p1 = Math.min(firstPlayer, secondPlayer);
        int p2 = Math.max(firstPlayer, secondPlayer);
        if (p1 + p2 == n + 1) {
            // p1 and p2 compete in the first round
            return new int[] {1, 1};
        }
        if (n == 3 || n == 4) {
            // p1 and p2 must compete in the second round (only two rounds).
            return new int[] {2, 2};
        }
        // Flip to make p1 be more closer to left than p2 to right end for convenience
        if (p1 - 1 > n - p2) {
            int t = n + 1 - p1;
            p1 = n + 1 - p2;
            p2 = t;
        }
        int m = (n + 1) / 2;
        int min = n;
        int max = 1;
        if (p2 * 2 <= n + 1) {
            // p2 is in first half (n odd or even) or exact middle (n odd)
            //   1  2  3  4  5  6  7  8  9 10 11 12 13 14
            //   .  .  *  .  .  *  .  .  .  .  .  .  .  .
            //         ^        ^
            //         p1       p2
            // Group A are players in front of p1
            // Group B are players between p1 and p2
            int a = p1 - 1;
            int b = p2 - p1 - 1;
            // i represents number of front players in A wins
            // j represents number of front players in B wins
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <= b; j++) {
                    int[] ret = earliestAndLatest(m, i + 1, i + j + 2);
                    min = Math.min(min, 1 + ret[0]);
                    max = Math.max(max, 1 + ret[1]);
                }
            }
        } else {
            // p2 is in the later half (and has >= p1 distance to the end)
            //    1  2  3  4  5  6  7  8  9 10 11 12 13 14
            //    .  .  *  .  .  .  .  .  .  *  .  .  .  .
            //          ^                    ^
            //          p1   p4             p2    p3
            //                ^--------------^
            //          ^--------------------------^
            int p4 = n + 1 - p2;
            int a = p1 - 1;
            int b = p4 - p1 - 1;
            // Group C are players between p4 and p2, (c+1)/2 will advance to next round.
            int c = p2 - p4 - 1;
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <= b; j++) {
                    int[] ret = earliestAndLatest(m, i + 1, i + j + 1 + (c + 1) / 2 + 1);
                    min = Math.min(min, 1 + ret[0]);
                    max = Math.max(max, 1 + ret[1]);
                }
            }
        }
        return new int[] {min, max};
    }
}
