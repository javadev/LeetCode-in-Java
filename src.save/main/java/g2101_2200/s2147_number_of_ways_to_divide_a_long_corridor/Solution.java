package g2101_2200.s2147_number_of_ways_to_divide_a_long_corridor;

// #Hard #String #Dynamic_Programming #Math #2022_06_07_Time_54_ms_(62.96%)_Space_71.7_MB_(39.81%)

public class Solution {
    public int numberOfWays(String corridor) {
        int seat = 0;
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i) == 'S') {
                seat++;
            }
        }
        if (seat == 0 || seat % 2 != 0) {
            return 0;
        }
        seat /= 2;
        long curr = 0;
        long ans = 1;
        int i = 0;
        while (corridor.charAt(i) != 'S') {
            i++;
        }
        i++;
        while (seat > 1) {
            while (corridor.charAt(i) != 'S') {
                i++;
            }
            i++;
            while (corridor.charAt(i) != 'S') {
                i++;
                curr++;
            }
            curr++;
            ans = (ans * curr) % mod;
            curr = 0;
            seat--;
            i++;
        }
        return (int) ans;
    }
}
