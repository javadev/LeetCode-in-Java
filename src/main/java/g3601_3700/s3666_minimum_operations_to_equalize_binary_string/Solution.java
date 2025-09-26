package g3601_3700.s3666_minimum_operations_to_equalize_binary_string;

// #Hard #String #Hash_Table #Math #Biweekly_Contest_164 #Breadth_First_Search
// #2025_09_26_Time_6_ms_(85.17%)_Space_45.57_MB_(88.76%)

public class Solution {
    public int minOperations(String s, int k) {
        int n = s.length();
        int cnt0 = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                cnt0++;
            }
        }
        if (cnt0 == 0) {
            return 0;
        }
        if (k == n) {
            return cnt0 == n ? 1 : -1;
        }
        int kP = k & 1;
        int needP = cnt0 & 1;
        long best = Long.MAX_VALUE;
        for (int p = 0; p <= 1; p++) {
            if ((p * kP) % 2 != needP) {
                continue;
            }
            long mismatch = (p == 0) ? cnt0 : (n - cnt0);
            long b1 = (cnt0 + k - 1L) / k;
            long b2;
            b2 = (mismatch + (n - k) - 1L) / (n - k);
            long lb = Math.max(b1, b2);
            if (lb < 1) {
                lb = 1;
            }
            if ((lb & 1) != p) {
                lb++;
            }
            if (lb < best) {
                best = lb;
            }
        }
        return best == Long.MAX_VALUE ? -1 : (int) best;
    }
}
