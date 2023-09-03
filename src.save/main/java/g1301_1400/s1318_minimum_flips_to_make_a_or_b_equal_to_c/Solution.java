package g1301_1400.s1318_minimum_flips_to_make_a_or_b_equal_to_c;

// #Medium #Bit_Manipulation #2022_03_19_Time_0_ms_(100.00%)_Space_40.6_MB_(60.32%)

public class Solution {
    public static int csb(int n) {
        int cnt = 0;
        while (n > 0) {
            int rsb = n & -n;
            n -= rsb;
            cnt++;
        }
        return cnt;
    }

    public int minFlips(int a, int b, int c) {
        int ans = 0;
        int or = a | b;
        ans += csb(or ^ c);
        int and = a & b;
        ans += csb(and & ~c);
        return ans;
    }
}
