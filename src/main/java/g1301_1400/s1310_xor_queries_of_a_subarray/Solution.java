package g1301_1400.s1310_xor_queries_of_a_subarray;

// #Medium #Array #Bit_Manipulation #Prefix_Sum #2022_03_15_Time_3_ms_(68.91%)_Space_67_MB_(34.60%)

public class Solution {
    public int[] xorQueries(int[] A, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] ^ A[i];
        }
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            res[i] = (query[0] == 0 ? A[query[1]] : A[query[0] - 1] ^ A[query[1]]);
        }
        return res;
    }
}
