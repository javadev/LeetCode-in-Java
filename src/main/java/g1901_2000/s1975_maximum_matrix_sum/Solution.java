package g1901_2000.s1975_maximum_matrix_sum;

// #Medium #Array #Greedy #Matrix #2022_05_21_Time_4_ms_(100.00%)_Space_79.8_MB_(36.28%)

public class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int numNegatives = 0;
        long totalSum = 0;
        int minNeg = Integer.MIN_VALUE;
        int minPos = Integer.MAX_VALUE;
        for (int[] ints : matrix) {
            for (int e = 0; e < matrix[0].length; e++) {
                int value = ints[e];
                if (value < 0) {
                    numNegatives++;
                    totalSum = totalSum - value;
                    minNeg = Math.max(value, minNeg);
                } else {
                    totalSum = totalSum + value;
                    minPos = Math.min(value, minPos);
                }
            }
        }

        int min = Math.min(minPos, -minNeg);

        return totalSum - numNegatives % 2 * (min + min);
    }
}
