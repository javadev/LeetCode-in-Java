package g3301_3400.s3337_total_characters_in_string_after_transformations_ii;

// #Hard #2024_10_27_Time_340_ms_(100.00%)_Space_45.1_MB_(100.00%)

import java.util.List;

public class Solution {
    private static final int MOD = 1_000_000_007;
    private static final int ALPHABET_SIZE = 26;

    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        // Initialize transformation matrix M
        int[][] matrix = new int[ALPHABET_SIZE][ALPHABET_SIZE];
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            int transforms = nums.get(i);
            for (int j = 0; j < transforms; j++) {
                matrix[i][(i + j + 1) % ALPHABET_SIZE]++;
            }
        }
        // Initialize count array based on string `s`
        int[] count = new int[ALPHABET_SIZE];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        // Apply matrix exponentiation to get M^t
        int[][] matrixT = power(matrix, t);
        // Calculate final character counts after t transformations
        int[] finalCount = new int[ALPHABET_SIZE];
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            for (int j = 0; j < ALPHABET_SIZE; j++) {
                finalCount[j] =
                        (int) ((finalCount[j] + ((long) matrixT[i][j] * count[i]) % MOD) % MOD);
            }
        }
        // Calculate total length
        int totalLength = 0;
        for (int cnt : finalCount) {
            totalLength = (totalLength + cnt) % MOD;
        }
        return totalLength;
    }

    // Matrix multiplication function
    private int[][] multiply(int[][] a, int[][] b) {
        int[][] matrixC = new int[ALPHABET_SIZE][ALPHABET_SIZE];
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            for (int j = 0; j < ALPHABET_SIZE; j++) {
                for (int k = 0; k < ALPHABET_SIZE; k++) {
                    matrixC[i][j] =
                            (int) ((matrixC[i][j] + ((long) a[i][k] * b[k][j]) % MOD) % MOD);
                }
            }
        }
        return matrixC;
    }

    // Matrix exponentiation function
    private int[][] power(int[][] matrix, int exp) {
        int[][] result = new int[ALPHABET_SIZE][ALPHABET_SIZE];
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            // Identity matrix
            result[i][i] = 1;
        }
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = multiply(result, matrix);
            }
            matrix = multiply(matrix, matrix);
            exp /= 2;
        }
        return result;
    }
}
