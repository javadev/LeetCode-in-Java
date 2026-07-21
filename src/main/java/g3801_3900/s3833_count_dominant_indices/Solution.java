package g3801_3900.s3833_count_dominant_indices;

// #Easy #Array #Enumeration #Mid_Level #Weekly_Contest_488
// #2026_07_21_Time_1_ms_(100.00%)_Space_46.45_MB_(19.67%)

public class Solution {
    public int dominantIndices(int[] a) {
        int n = a.length;
        long sum = 0;
        int cnt = 0;
        for (int i = n - 1; i > 0; i--) {
            sum += a[i];
            if (a[i - 1] > sum / (n - i)) {
                cnt++;
            }
        }
        return cnt;
    }
}
