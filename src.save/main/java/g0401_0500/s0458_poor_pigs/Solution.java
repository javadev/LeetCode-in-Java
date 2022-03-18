package g0401_0500.s0458_poor_pigs;

// #Hard #Dynamic_Programming #Math #Combinatorics
// #2022_03_18_Time_0_ms_(100.00%)_Space_40.9_MB_(32.84%)

public class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (buckets-- == 1) {
            return 0;
        }
        int base = minutesToTest / minutesToDie + 1;
        int count = 0;
        while (buckets > 0) {
            buckets /= base;
            count++;
        }
        return count;
    }
}
