package g2501_2600.s2600_k_items_with_the_maximum_sum;

// #Easy #Math #Greedy #2023_08_29_Time_1_ms_(100.00%)_Space_40.3_MB_(19.10%)

@SuppressWarnings("java:S1172")
public class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        }
        if (k <= numOnes + numZeros) {
            return numOnes;
        }
        int remainingSum = k - (numOnes + numZeros);
        return numOnes - remainingSum;
    }
}
