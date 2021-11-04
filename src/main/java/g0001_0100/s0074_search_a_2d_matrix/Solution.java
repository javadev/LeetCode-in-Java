package g0001_0100.s0074_search_a_2d_matrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int[] cur = matrix[i];
            int max = cur[n - 1];
            if (max == target) {
                return true;
            }
            if (max > target) {
                int index = binarySearch(cur, 0, n - 1, target);
                return index >= 0;
            }
        }
        return false;
    }

    int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
