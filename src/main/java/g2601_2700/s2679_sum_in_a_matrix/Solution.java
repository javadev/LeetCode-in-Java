package g2601_2700.s2679_sum_in_a_matrix;

// #Medium #Array #Sorting #Matrix #Heap_Priority_Queue #Simulation
// #2023_09_11_Time_13_ms_(99.66%)_Space_56.9_MB_(31.71%)

import java.util.Arrays;

public class Solution {
    public int matrixSum(int[][] nums) {
        int result = 0;

        for (int[] row : nums) {
            Arrays.sort(row);
            reverseArray(row);
        }

        for (int i = 0; i < nums[0].length; i++) {
            int max = 0;
            for (int[] num : nums) {
                max = Math.max(max, num[i]);
            }
            result += max;
        }

        return result;
    }

    private void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
