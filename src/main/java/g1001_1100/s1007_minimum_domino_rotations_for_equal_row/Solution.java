package g1001_1100.s1007_minimum_domino_rotations_for_equal_row;

// #Medium #Array #Greedy #Udemy_Arrays #2022_02_21_Time_5_ms_(79.64%)_Space_94.6_MB_(43.31%)

public class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int top = tops[0];
        int tCount = 0;
        int bCount = 0;
        int tSwaps;
        int bSwaps;
        int swaps = 0;
        boolean valid = true;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] == top) {
                tCount++;
            }
            if (bottoms[i] == top) {
                bCount++;
            }
            if (tops[i] != top && bottoms[i] != top) {
                valid = false;
                swaps = -1;
                break;
            }
        }
        if (valid) {
            tSwaps = tops.length - tCount;
            bSwaps = bottoms.length - bCount;
            swaps = Math.min(tSwaps, bSwaps);
        }
        int bottom = bottoms[0];
        int tCount1 = 0;
        int bCount1 = 0;
        int tSwaps1;
        int bSwaps1;
        int swaps1 = 0;
        boolean valid1 = true;
        for (int i = 0; i < bottoms.length; i++) {
            if (tops[i] == bottom) {
                tCount1++;
            }
            if (bottoms[i] == bottom) {
                bCount1++;
            }
            if (tops[i] != bottom && bottoms[i] != bottom) {
                valid1 = false;
                swaps1 = -1;
                break;
            }
        }
        if (valid1) {
            tSwaps1 = tops.length - tCount1;
            bSwaps1 = bottoms.length - bCount1;
            swaps1 = Math.min(tSwaps1, bSwaps1);
        }
        int[] ans = new int[2];
        if (swaps1 < swaps) {
            ans[0] = swaps1;
            ans[1] = swaps;
        } else {
            ans[0] = swaps;
            ans[1] = swaps1;
        }
        if (ans[0] != -1) {
            return ans[0];
        } else {
            return ans[1];
        }
    }
}
