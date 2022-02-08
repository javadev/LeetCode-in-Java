package g0801_0900.s0861_score_after_flipping_matrix;

// #Medium #Array #Greedy #Matrix #Bit_Manipulation

public class Solution {
    public int matrixScore(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            if (a[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] == 0) {
                        a[i][j] = 1;
                    } else {
                        a[i][j] = 0;
                    }
                }
            }
        }
        for (int j = 1; j < n; j++) {
            int ones = 0;
            for (int[] ints : a) {
                if (ints[j] == 1) {
                    ones++;
                }
            }
            if (ones <= m / 2) {
                for (int i = 0; i < m; i++) {
                    if (a[i][j] == 1) {
                        a[i][j] = 0;
                    } else {
                        a[i][j] = 1;
                    }
                }
            }
        }
        int result = 0;
        for (int[] ints : a) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(ints[j]);
            }
            result += Integer.parseInt(sb.toString(), 2);
        }
        return result;
    }
}
