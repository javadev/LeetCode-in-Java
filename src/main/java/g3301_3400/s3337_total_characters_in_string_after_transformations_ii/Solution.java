package g3301_3400.s3337_total_characters_in_string_after_transformations_ii;

// #Hard #String #Hash_Table #Dynamic_Programming #Math #Counting
// #2025_05_14_Time_80_ms_(72.97%)_Space_45.62_MB_(24.32%)

import java.util.List;

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int lengthAfterTransformations(String s, int t, List<Integer> numsList) {
        int[][] localT = buildTransformationMatrix(numsList);
        int[][] tPower = matrixPower(localT, t);
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        long result = 0;
        for (int i = 0; i < 26; i++) {
            long sum = 0;
            for (int j = 0; j < 26; j++) {
                sum = (sum + (long) freq[j] * tPower[j][i]) % MOD;
            }
            result = (result + sum) % MOD;
        }

        return (int) result;
    }

    private int[][] buildTransformationMatrix(List<Integer> numsList) {
        int[][] localT = new int[26][26];
        for (int i = 0; i < 26; i++) {
            int steps = numsList.get(i);
            for (int j = 1; j <= steps; j++) {
                localT[i][(i + j) % 26]++;
            }
        }
        return localT;
    }

    private int[][] matrixPower(int[][] matrix, int power) {
        int size = matrix.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            result[i][i] = 1;
        }
        while (power > 0) {
            if ((power & 1) == 1) {
                result = multiplyMatrices(result, matrix);
            }
            matrix = multiplyMatrices(matrix, matrix);
            power >>= 1;
        }
        return result;
    }

    private int[][] multiplyMatrices(int[][] a, int[][] b) {
        int size = a.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                if (a[i][k] == 0) {
                    continue;
                }
                for (int j = 0; j < size; j++) {
                    result[i][j] = (int) ((result[i][j] + (long) a[i][k] * b[k][j]) % MOD);
                }
            }
        }
        return result;
    }
}
