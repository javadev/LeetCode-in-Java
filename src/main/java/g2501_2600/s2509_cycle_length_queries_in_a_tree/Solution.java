package g2501_2600.s2509_cycle_length_queries_in_a_tree;

// #Hard #Tree #Binary_Tree #2023_03_20_Time_12_ms_(99.26%)_Space_89.2_MB_(27.94%)

@SuppressWarnings("java:S1172")
public class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int m = queries.length;
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int count = 1;
            while (a != b) {
                if (a > b) {
                    a = a >> 1;
                } else {
                    b = b >> 1;
                }
                count++;
            }
            res[i] = count;
        }
        return res;
    }
}
