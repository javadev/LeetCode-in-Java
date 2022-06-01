package g1001_1100.s1052_grumpy_bookstore_owner;

// #Medium #Array #Sliding_Window #2022_02_28_Time_4_ms_(70.26%)_Space_54.4_MB_(27.35%)

public class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        // storing numbers of customers who faced grumpy owner till ith minute.
        int[] grumpySum = new int[grumpy.length];
        int ans = 0;
        if (grumpy[0] == 1) {
            grumpySum[0] = customers[0];
        } else {
            ans += customers[0];
        }
        for (int i = 1; i < grumpy.length; i++) {
            if (grumpy[i] == 1) {
                grumpySum[i] = grumpySum[i - 1] + customers[i];
            } else {
                grumpySum[i] = grumpySum[i - 1];
                ans += customers[i];
            }
        }
        // calculating max number of customers who faced grumpy owner in a window of size 'minutes'.
        int max = 0;
        for (int i = 0; i <= customers.length - minutes; i++) {
            if (i == 0) {
                max = Math.max(max, grumpySum[i + minutes - 1]);
            } else {
                max = Math.max(max, grumpySum[i + minutes - 1] - grumpySum[i - 1]);
            }
        }
        // making the owner non-grumpy in that max window and adding the number of customers who do
        // not face the grumpy customers.
        ans += max;
        return ans;
    }
}
