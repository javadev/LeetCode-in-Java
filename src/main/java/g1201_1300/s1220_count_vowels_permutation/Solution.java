package g1201_1300.s1220_count_vowels_permutation;

// #Hard #Dynamic_Programming #2022_03_11_Time_7_ms_(98.50%)_Space_41.3_MB_(72.81%)

public class Solution {
    public int countVowelPermutation(int n) {
        int MOD = (int) 1e9 + 7;
        int prev_a = 1;
        int prev_e = 1;
        int prev_i = 1;
        int prev_o = 1;
        int prev_u = 1;

        while (n-- > 1) {
            int a = ((prev_e + prev_i) % MOD + prev_u) % MOD;

            int e = (prev_a + prev_i) % MOD;

            int i = (prev_e + prev_o) % MOD;

            int o = prev_i;

            int u = (prev_i + prev_o) % MOD;

            prev_a = a;
            prev_e = e;
            prev_i = i;
            prev_o = o;
            prev_u = u;
        }

        return ((((prev_a + prev_e) % MOD + prev_i) % MOD + prev_o) % MOD + prev_u) % MOD;
    }
}
