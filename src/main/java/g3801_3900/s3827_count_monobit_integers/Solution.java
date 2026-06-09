package g3801_3900.s3827_count_monobit_integers;

// #Easy #Bit_Manipulation #Enumeration #Mid_Level #Weekly_Contest_487
// #2026_06_09_Time_1_ms_(99.41%)_Space_42.33_MB_(91.20%)

public class Solution {
    public int countMonobit(int n) {
        int count = 1;

        int val = 1;
        while (val <= n) {
            count++;
            val = (val << 1) | 1;
        }

        return count;
    }
}
