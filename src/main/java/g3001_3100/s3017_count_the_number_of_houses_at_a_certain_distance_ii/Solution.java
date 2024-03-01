package g3001_3100.s3017_count_the_number_of_houses_at_a_certain_distance_ii;

// #Hard #Breadth_First_Search #Graph #Prefix_Sum
// #2024_02_28_Time_6_ms_(93.62%)_Space_60_MB_(56.71%)

public class Solution {
    public long[] countOfPairs(int n, int x, int y) {
        long[] result = new long[n];
        int leftCount = Math.min(x, y) - 1;
        int rightCount = n - Math.max(x, y);
        int circleCount = n - leftCount - rightCount;
        circleInternal(circleCount, result);
        lineToCircle(leftCount, circleCount, result);
        lineToCircle(rightCount, circleCount, result);
        lineToLine(leftCount, rightCount, x == y ? 1 : 2, result);
        lineInternal(leftCount, result);
        lineInternal(rightCount, result);
        return result;
    }

    private void lineToCircle(int lineCount, int circleCount, long[] curRes) {
        int circleLen = circleCount / 2 + 1;
        int curModifier = 0;
        for (int i = 1; i < circleLen + lineCount; ++i) {
            if (i <= Math.min(lineCount, circleLen)) {
                curModifier += 4;
            } else if (i > Math.max(lineCount, circleLen)) {
                curModifier -= 4;
            }
            curRes[i - 1] += curModifier;
            if (i <= lineCount) {
                curRes[i - 1] -= 2;
            }
            if (i >= circleLen && circleCount % 2 == 0) {
                curRes[i - 1] -= 2;
            }
        }
    }

    private void lineToLine(int lineCount1, int lineCount2, int initialDis, long[] curRes) {
        int curModifier = 0;
        for (int i = 1; i < lineCount1 + lineCount2; ++i) {
            if (i <= Math.min(lineCount1, lineCount2)) {
                curModifier += 2;
            } else if (i > Math.max(lineCount1, lineCount2)) {
                curModifier -= 2;
            }
            curRes[i - 1 + initialDis] += curModifier;
        }
    }

    private void lineInternal(int lineCount, long[] curRes) {
        for (int i = 1; i < lineCount; ++i) {
            curRes[i - 1] += (lineCount - i) * 2L;
        }
    }

    private void circleInternal(int circleCount, long[] curRes) {
        for (int i = 0; i < circleCount / 2; ++i) {
            if (circleCount % 2 == 0 && i + 1 == circleCount / 2) {
                curRes[i] += circleCount;
            } else {
                curRes[i] += circleCount * 2L;
            }
        }
    }
}
