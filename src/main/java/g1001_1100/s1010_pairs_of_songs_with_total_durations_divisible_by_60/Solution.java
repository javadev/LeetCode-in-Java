package g1001_1100.s1010_pairs_of_songs_with_total_durations_divisible_by_60;

// #Medium #Array #Hash_Table #Counting #2022_02_21_Time_4_ms_(64.39%)_Space_54.1_MB_(10.42%)

public class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainder = new int[60];
        int ans = 0;
        for (int j : time) {
            int rem = j % 60;
            if (rem == 0) {
                ans += remainder[0];
            } else {
                ans += remainder[60 - rem];
            }
            remainder[rem]++;
        }
        return ans;
    }
}
