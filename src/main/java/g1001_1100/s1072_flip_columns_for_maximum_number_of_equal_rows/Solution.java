package g1001_1100.s1072_flip_columns_for_maximum_number_of_equal_rows;

// #Medium #Array #Hash_Table #Matrix #2022_02_27_Time_26_ms_(95.71%)_Space_51.4_MB_(92.86%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        /*
        Idea:
        For a given row[i], 0<=i<m, row[j], 0<=j<m and j!=i, if either of them can have
        all values equal after some number of flips, then
         row[i]==row[j]  <1> or
         row[i]^row[j] == 111...111 <2> (xor result is a row full of '1')

        Go further, in case<2> row[j] can turn to row[i] by flipping each column of row[j]
        IF assume row[i][0] is 0, then question is convert into:
         1> flipping each column of each row if row[i][0] is not '0',
         2> count the frequency of each row.
         The biggest number of frequencies is the answer.
         */

        // O(M*N), int M = matrix.length, N = matrix[0].length;
        int answer = 0;
        Map<String, Integer> frequency = new HashMap<>();
        for (int[] row : matrix) {
            StringBuilder rowStr = new StringBuilder();
            for (int c : row) {
                if (row[0] == 1) {
                    rowStr.append(c == 1 ? 0 : 1);
                } else {
                    rowStr.append(c);
                }
            }
            String key = rowStr.toString();
            int value = frequency.getOrDefault(key, 0) + 1;
            frequency.put(key, value);
            answer = Math.max(answer, value);
        }
        return answer;
    }
}
