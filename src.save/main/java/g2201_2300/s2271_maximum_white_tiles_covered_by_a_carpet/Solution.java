package g2201_2300.s2271_maximum_white_tiles_covered_by_a_carpet;

// #Medium #Array #Sorting #Greedy #Binary_Search #Prefix_Sum
// #2022_06_16_Time_74_ms_(71.51%)_Space_86_MB_(38.91%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLength) {
        Arrays.sort(tiles, Comparator.comparingInt(x -> x[0]));
        int currentCover = Math.min(tiles[0][1] - tiles[0][0] + 1, carpetLength);
        int maxCover = currentCover;
        int head = 1;
        int tail = 0;
        while (tail < tiles.length && head < tiles.length && maxCover < carpetLength) {
            if (tiles[head][1] - tiles[tail][0] + 1 <= carpetLength) {
                currentCover += tiles[head][1] - tiles[head][0] + 1;
                maxCover = Math.max(maxCover, currentCover);
                ++head;
            } else {
                int possiblePartialCoverOverCurrentHead =
                        carpetLength - (tiles[head][0] - tiles[tail][0]);
                maxCover = Math.max(maxCover, currentCover + possiblePartialCoverOverCurrentHead);
                currentCover = currentCover - (tiles[tail][1] - tiles[tail][0] + 1);
                ++tail;
            }
        }
        return maxCover;
    }
}
