package g1301_1400.s1329_sort_the_matrix_diagonally;

// #Medium #Array #Sorting #Matrix #2024_12_19_Time_0_ms_(100.00%)_Space_44.7_MB_(81.35%)

public class Solution {
    private int[] count = new int[101];
    private int m;
    private int n;

    public void search(int[][] mat, int i, int j) {
        for (int ti = i, tj = j; ti < m && tj < n; ti++, tj++) {
            count[mat[ti][tj]]++;
        }
        int c = 0;
        for (int ti = i, tj = j; ti < m && tj < n; ti++, tj++) {
            while (count[c] == 0) {
                c++;
            }
            mat[ti][tj] = c;
            count[c]--;
        }
    }

    public int[][] diagonalSort(int[][] mat) {
        m = mat.length;
        n = mat[0].length;
        for (int i = 0; i < m; i++) {
            search(mat, i, 0);
        }
        for (int i = 1; i < n; i++) {
            search(mat, 0, i);
        }
        return mat;
    }
}
