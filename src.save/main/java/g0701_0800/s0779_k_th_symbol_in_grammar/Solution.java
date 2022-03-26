package g0701_0800.s0779_k_th_symbol_in_grammar;

// #Medium #Math #Bit_Manipulation #Recursion #2022_03_26_Time_0_ms_(100.00%)_Space_40.9_MB_(42.87%)

@SuppressWarnings("java:S1172")
public class Solution {
    /*
     * Time: O(logn)
     * Space: O(1)
     */
    public int kthGrammar(int n, int k) {
        return Integer.bitCount(k - 1) % 2;
    }
}
