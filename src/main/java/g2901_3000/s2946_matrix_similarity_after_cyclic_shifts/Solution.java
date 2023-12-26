package g2901_3000.s2946_matrix_similarity_after_cyclic_shifts;

// #Easy #Array #Math #Matrix #Simulation #2023_12_26_Time_1_ms_(100.00%)_Space_44.5_MB_(14.88%)

public class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k %= n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i & 1) != 0) {
                    if (mat[i][j] != mat[i][(j - k + n) % n]) {
                        return false;
                    }
                } else {
                    if (mat[i][j] != mat[i][(j + k) % n]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
