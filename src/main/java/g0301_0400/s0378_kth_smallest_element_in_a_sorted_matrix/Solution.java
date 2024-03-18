package g0301_0400.s0378_kth_smallest_element_in_a_sorted_matrix;

// #Medium #Array #Sorting #Binary_Search #Matrix #Heap_Priority_Queue
// #2022_07_13_Time_1_ms_(92.14%)_Space_58_MB_(9.74%)

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }
        int start = matrix[0][0];
        int end = matrix[matrix.length - 1][matrix[0].length - 1];
        // O(log(max-min)) time
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (countLessEqual(matrix, mid) < k) {
                // look towards end
                start = mid;
            } else {
                // look towards start
                end = mid;
            }
        }

        // leave only with start and end, one of them must be the answer
        // try to see if start fits the criteria first
        if (countLessEqual(matrix, start) >= k) {
            return start;
        } else {
            return end;
        }
    }

    // countLessEqual
    // O(n) Time
    private int countLessEqual(int[][] matrix, int target) {
        // binary elimination from top right
        int row = 0;
        int col = matrix[0].length - 1;
        int count = 0;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] <= target) {
                // get the count in current row
                count += col + 1;
                row++;
            } else if (matrix[row][col] > target) {
                // eliminate the current col
                col--;
            }
        }
        return count;
    }
}
