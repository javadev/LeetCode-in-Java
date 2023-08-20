package g1901_2000.s1901_find_a_peak_element_ii;

// #Medium #Array #Binary_Search #Matrix #Divide_and_Conquer #Binary_Search_II_Day_17
// #2022_05_11_Time_0_ms_(100.00%)_Space_115.1_MB_(45.96%)

public class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int l = 0;
        int r = m - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            int mx = mat[0][mid];
            int mxi = 0;
            for (int i = 1; i < n; i++) {
                if (mx < mat[i][mid]) {
                    mx = mat[i][mid];
                    mxi = i;
                }
            }
            int lv = mid > l ? mat[mxi][mid - 1] : -1;
            int rv = mid < r ? mat[mxi][mid + 1] : -1;
            if (mx > lv && mx > rv) {
                return new int[] {mxi, mid};
            } else if (mx > lv) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }
}
