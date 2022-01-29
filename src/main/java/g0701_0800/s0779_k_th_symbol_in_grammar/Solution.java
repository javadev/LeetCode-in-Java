package g0701_0800.s0779_k_th_symbol_in_grammar;

// #Medium #Math #Bit_Manipulation #Recursion

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
