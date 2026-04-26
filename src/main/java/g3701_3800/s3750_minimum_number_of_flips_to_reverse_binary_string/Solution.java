package g3701_3800.s3750_minimum_number_of_flips_to_reverse_binary_string;

// #Easy #String #Math #Two_Pointers #Bit_Manipulation #Mid_Level #Biweekly_Contest_170
// #2026_04_26_Time_1_ms_(100.00%)_Space_42.88_MB_(49.74%)

public class Solution {
    public int minimumFlips(int n) {
        int ans = 0;
        int temp = n;
        int l = 0;
        int r = -1;
        while (temp > 0) {
            temp >>= 1;
            r++;
        }
        while (l < r) {
            ans += ((n >> l) & 1) ^ ((n >> r) & 1);
            l++;
            r--;
        }
        return 2 * ans;
    }
}
