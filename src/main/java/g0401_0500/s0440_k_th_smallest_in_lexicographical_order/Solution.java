package g0401_0500.s0440_k_th_smallest_in_lexicographical_order;

// #Hard #Trie #2022_07_16_Time_0_ms_(100.00%)_Space_40.7_MB_(63.75%)

public class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k = k - 1;
        while (k > 0) {
            int steps = calSteps(n, curr, curr + 1L);
            if (steps <= k) {
                curr += 1;
                k -= steps;
            } else {
                curr *= 10;
                k -= 1;
            }
        }
        return curr;
    }

    // use long in case of overflow
    private int calSteps(int n, long n1, long n2) {
        long steps = 0;
        while (n1 <= n) {
            steps += Math.min(n + 1L, n2) - n1;
            n1 *= 10;
            n2 *= 10;
        }
        return (int) steps;
    }
}
