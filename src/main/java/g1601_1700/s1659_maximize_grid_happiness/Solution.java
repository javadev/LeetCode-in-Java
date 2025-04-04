package g1601_1700.s1659_maximize_grid_happiness;

// #Hard #Dynamic_Programming #Bit_Manipulation #Bitmask #Memoization
// #2025_04_04_Time_39_ms_(86.36%)_Space_54.76_MB_(72.73%)

public class Solution {
    private static final int NONE = 0;
    private static final int INTROVERT = 1;
    private static final int EXTROVERT = 2;

    private int maxHappiness(
            int index,
            int m,
            int n,
            int introverts,
            int extroverts,
            int board,
            int[][][][] dp,
            int tmask) {
        if (index >= m * n) {
            return 0;
        }
        if (dp[index][introverts][extroverts][board] != 0) {
            return dp[index][introverts][extroverts][board];
        }
        int introScore = -1;
        int extroScore = -1;
        if (introverts > 0) {
            int newBoard = ((board << 2) | INTROVERT) & tmask;
            introScore =
                    120
                            + adjust(board, INTROVERT, n, index)
                            + maxHappiness(
                                    index + 1,
                                    m,
                                    n,
                                    introverts - 1,
                                    extroverts,
                                    newBoard,
                                    dp,
                                    tmask);
        }
        if (extroverts > 0) {
            int newBoard = ((board << 2) | EXTROVERT) & tmask;
            extroScore =
                    40
                            + adjust(board, EXTROVERT, n, index)
                            + maxHappiness(
                                    index + 1,
                                    m,
                                    n,
                                    introverts,
                                    extroverts - 1,
                                    newBoard,
                                    dp,
                                    tmask);
        }
        int newBoard = ((board << 2) | NONE) & tmask;
        int skip = maxHappiness(index + 1, m, n, introverts, extroverts, newBoard, dp, tmask);
        dp[index][introverts][extroverts][board] = Math.max(skip, Math.max(introScore, extroScore));
        return dp[index][introverts][extroverts][board];
    }

    private int adjust(int board, int thisIs, int col, int index) {
        int shiftBy = 2 * (col - 1);
        int left = board & 0x03;
        if (index % col == 0) {
            left = NONE;
        }
        int up = (board >> shiftBy) & 0x03;
        int[] combination = new int[] {left, up};
        int adjustment = 0;
        for (int neighbor : combination) {
            if (neighbor == NONE) {
                continue;
            }
            if (neighbor == INTROVERT && thisIs == INTROVERT) {
                adjustment -= 60;
            } else if (neighbor == INTROVERT && thisIs == EXTROVERT) {
                adjustment -= 10;
            } else if (neighbor == EXTROVERT && thisIs == INTROVERT) {
                adjustment -= 10;
            } else if (neighbor == EXTROVERT && thisIs == EXTROVERT) {
                adjustment += 40;
            }
        }
        return adjustment;
    }

    public int getMaxGridHappiness(int m, int n, int introvertsCount, int extrovertsCount) {
        int[][][][] dp = new int[m * n][introvertsCount + 1][extrovertsCount + 1][(1 << (2 * n))];
        int tmask = (1 << (2 * n)) - 1;
        return maxHappiness(0, m, n, introvertsCount, extrovertsCount, 0, dp, tmask);
    }
}
