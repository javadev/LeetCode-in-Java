package g0301_0400.s0378_kth_smallest_element_in_a_sorted_matrix;

// #Medium #Top_Interview_Questions #Array #Sorting #Binary_Search #Matrix #Heap_Priority_Queue

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int l = matrix[0][0];
        int h = matrix[n - 1][n - 1];
        while (l <= h) {
            int m = (l + h) / 2;
            int cnt = getLessThanCount(matrix, m);
            if (cnt < k) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return l;
    }

    private int getLessThanCount(int[][] m, int k) {
        int i = m.length - 1;
        int j = 0;
        int cnt = 0;
        while (i >= 0 && j < m.length) {
            if (m[i][j] <= k) {
                j++;
                cnt += i + 1;
            } else {
                i--;
            }
        }
        return cnt;
    }
}
