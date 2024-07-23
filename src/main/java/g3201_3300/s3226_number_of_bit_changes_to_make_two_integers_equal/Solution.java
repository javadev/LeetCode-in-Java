package g3201_3300.s3226_number_of_bit_changes_to_make_two_integers_equal;

// #Easy #Bit_Manipulation #2024_07_23_Time_0_ms_(100.00%)_Space_40.5_MB_(97.19%)

public class Solution {
    public int minChanges(int n, int k) {
        if ((n | k) != n) {
            return -1;
        }
        int cnt = 0;
        while (n > 0 || k > 0) {
            int bitN = n & 1;
            int bitK = k & 1;
            if (bitN == 1 && bitK == 0) {
                cnt++;
            }
            n >>= 1;
            k >>= 1;
        }
        return cnt;
    }
}
