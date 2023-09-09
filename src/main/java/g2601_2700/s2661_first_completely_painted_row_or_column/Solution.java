package g2601_2700.s2661_first_completely_painted_row_or_column;

// #Medium #Array #Hash_Table #Matrix #2023_09_09_Time_22_ms_(85.61%)_Space_64.7_MB_(58.25%)

import java.util.HashMap;

public class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = map.get(mat[i][j]);
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int[] ints : mat) {
            int max = 0;
            for (int j = 0; j < mat[0].length; j++) {
                max = Math.max(max, ints[j]);
            }
            ans = Math.min(ans, max);
        }

        for (int i = 0; i < mat[0].length; i++) {
            int max = 0;
            for (int[] ints : mat) {
                max = Math.max(max, ints[i]);
            }
            ans = Math.min(ans, max);
        }

        return ans;
    }
}
