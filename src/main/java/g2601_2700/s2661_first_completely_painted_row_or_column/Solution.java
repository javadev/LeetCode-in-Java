package g2601_2700.s2661_first_completely_painted_row_or_column;

// #Medium #Array #Hash_Table #Matrix #2025_02_25_Time_2_ms_(100.00%)_Space_57.98_MB_(96.93%)

public class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] numMapIndex = new int[mat.length * mat[0].length + 1];
        for (int i = 0; i < arr.length; i++) {
            numMapIndex[arr[i]] = i;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int rowMin = Integer.MIN_VALUE;
            for (int i1 = 0; i1 < mat[i].length; i1++) {
                int index = numMapIndex[mat[i][i1]];
                rowMin = Math.max(rowMin, index);
            }
            ans = Math.min(ans, rowMin);
        }
        for (int i = 0; i < mat[0].length; i++) {
            int colMin = Integer.MIN_VALUE;
            for (int i1 = 0; i1 < mat.length; i1++) {
                int index = numMapIndex[mat[i1][i]];
                colMin = Math.max(colMin, index);
            }
            ans = Math.min(ans, colMin);
        }
        return ans;
    }
}
