package g2701_2800.s2718_sum_of_matrix_after_queries;

// #Medium #Array #Hash_Table #2023_09_18_Time_3_ms_(100.00%)_Space_61.2_MB_(84.49%)

public class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        boolean[] queriedRow = new boolean[n];
        boolean[] queriedCol = new boolean[n];
        long sum = 0;
        int remainingRows = n;
        int remainingCols = n;
        for (int i = queries.length - 1; i >= 0; i--) {
            int type = queries[i][0];
            int index = queries[i][1];
            int value = queries[i][2];
            if ((type == 0 && !queriedRow[index]) || (type == 1 && !queriedCol[index])) {
                sum += (long) value * (type == 0 ? remainingCols : remainingRows);
                if (type == 0) {
                    remainingRows--;
                    queriedRow[index] = true;
                } else {
                    remainingCols--;
                    queriedCol[index] = true;
                }
            }
        }
        return sum;
    }
}
