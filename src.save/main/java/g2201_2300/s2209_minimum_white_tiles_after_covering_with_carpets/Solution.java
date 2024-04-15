package g2201_2300.s2209_minimum_white_tiles_after_covering_with_carpets;

// #Hard #String #Dynamic_Programming #Prefix_Sum
// #2022_06_10_Time_94_ms_(88.16%)_Space_82.4_MB_(50.00%)

public class Solution {
    public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
        int len = floor.length();
        int[][] dp = new int[numCarpets + 1][len + 1];
        int[] prefix = new int[len];
        int tiles = 0;
        int total = 0;
        for (int i = 0; i < len; i++) {
            // calculate total no of Tiles within the Carpet Length Window
            tiles += floor.charAt(i) - '0';
            // start excluding tiles which are not in the Range anymore of the Carpet Length given
            if (i - carpetLen >= 0) {
                tiles -= floor.charAt(i - carpetLen) - '0';
            }
            // the total no of tiles covered within the Carpet Length range for current index
            prefix[i] = tiles;
            total += floor.charAt(i) - '0';
        }
        for (int i = 1; i <= numCarpets; i++) {
            for (int j = 0; j < len; j++) {
                // if we do not wish to cover current Tile
                int doNot = dp[i][j];
                // if we do wish to cover current tile
                int doTake = dp[i - 1][Math.max(0, j - carpetLen + 1)] + prefix[j];
                // we should go back the Carpet length & check for tiles not covered before j -
                // carpet Length distance
                dp[i][j + 1] = Math.max(doTake, doNot);
            }
        }
        return total - dp[numCarpets][len];
    }
}
