package g3101_3200.s3185_count_pairs_that_form_a_complete_day_ii;

// #Medium #Array #Hash_Table #Counting #2024_06_21_Time_3_ms_(97.60%)_Space_97.1_MB_(14.69%)

public class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long[] hour = new long[24];
        for (int j : hours) {
            hour[j % 24]++;
        }
        long counter = hour[0] * (hour[0] - 1) / 2;
        counter += hour[12] * (hour[12] - 1) / 2;
        for (int i = 1; i < 12; i++) {
            counter += hour[i] * hour[24 - i];
        }
        return counter;
    }
}
