package g3101_3200.s3184_count_pairs_that_form_a_complete_day_i;

// #Easy #Array #Hash_Table #Counting #2024_06_21_Time_1_ms_(98.20%)_Space_42_MB_(83.72%)

public class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int[] modular = new int[26];
        int ans = 0;
        for (int hour : hours) {
            int mod = hour % 24;
            ans += modular[24 - mod];
            if (mod == 0) {
                modular[24]++;
            } else {
                modular[mod]++;
            }
        }
        return ans;
    }
}
