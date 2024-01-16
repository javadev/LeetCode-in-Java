package g1201_1300.s1220_count_vowels_permutation;

// #Hard #Dynamic_Programming #2022_03_11_Time_7_ms_(98.50%)_Space_41.3_MB_(72.81%)

public class Solution {
    public int countVowelPermutation(int n) {
        int mod = (int) 1e9 + 7;
        int prevA = 1;
        int prevE = 1;
        int prevI = 1;
        int prevO = 1;
        int prevU = 1;
        while (n-- > 1) {
            int a = ((prevE + prevI) % mod + prevU) % mod;
            int e = (prevA + prevI) % mod;
            int i = (prevE + prevO) % mod;
            int o = prevI;
            int u = (prevI + prevO) % mod;
            prevA = a;
            prevE = e;
            prevI = i;
            prevO = o;
            prevU = u;
        }
        return ((((prevA + prevE) % mod + prevI) % mod + prevO) % mod + prevU) % mod;
    }
}
