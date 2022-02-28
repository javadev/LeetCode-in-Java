package g0601_0700.s0668_kth_smallest_number_in_multiplication_table;

// #Hard #Binary_Search

public class Solution {
    public int findKthNumber(int m, int n, int k) {
        int lo = 1;
        int hi = m * n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int col = n;
            int row = 1;
            int count = 0;
            while (row <= m && col >= 1) {
                int val = row * col;
                if (val > mid) {
                    col--;
                } else {
                    count += col;
                    row++;
                }
            }
            if (count < k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
