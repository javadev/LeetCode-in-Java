package g1301_1400.s1329_sort_the_matrix_diagonally;

// #Medium #Array #Sorting #Matrix #2022_03_19_Time_15_ms_(26.03%)_Space_47.7_MB_(56.76%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] sorted = new int[m][n];
        for (int i = m - 1; i >= 0; i--) {
            int iCopy = i;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n && iCopy < m; j++, iCopy++) {
                list.add(mat[iCopy][j]);
            }
            Collections.sort(list);
            iCopy = i;
            for (int j = 0; j < n && iCopy < m; j++, iCopy++) {
                sorted[iCopy][j] = list.get(j);
            }
        }

        for (int j = n - 1; j > 0; j--) {
            int jCopy = j;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < m && jCopy < n; i++, jCopy++) {
                list.add(mat[i][jCopy]);
            }
            Collections.sort(list);
            jCopy = j;
            for (int i = 0; i < m && jCopy < n; i++, jCopy++) {
                sorted[i][jCopy] = list.get(i);
            }
        }
        return sorted;
    }
}
