package g2901_3000.s2945_find_maximum_non_decreasing_array_length;

// #Hard #Array #Dynamic_Programming #Binary_Search #Stack #Monotonic_Stack #Queue #Monotonic_Queue
// #2023_12_26_Time_11_ms_(98.10%)_Space_60_MB_(40.30%)

public class Solution {
    public int findMaximumLength(int[] nums) {
        int n = nums.length;
        int[] que = new int[n + 1];
        int write = 0;
        int read = 0;
        long[] prefixSum = new long[n + 1];
        long[] sums = new long[n + 1];
        int[] count = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
            while (read < write && prefixSum[i] >= sums[read + 1]) {
                read++;
            }
            int j = que[read];
            long subarraySum = prefixSum[i] - prefixSum[j];
            count[i] = count[j] + 1;
            long sum = prefixSum[i] + subarraySum;
            while (sum <= sums[write]) {
                write--;
            }
            que[++write] = i;
            sums[write] = sum;
        }
        return count[n];
    }
}
