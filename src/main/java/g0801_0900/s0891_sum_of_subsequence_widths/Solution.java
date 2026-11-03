package g0801_0900.s0891_sum_of_subsequence_widths;

// #Hard #Array #Math #Sorting #2026_11_03_Time_26_ms_(99.32%)_Space_66.80_MB_(8.84%)

public class Solution {
    public int sumSubseqWidths(int[] nums) {
        int[] numCnt = new int[100001];
        int[] prefixCnt = new int[100001];
        int[] postfixCnt = new int[100001];
        long mod = (long) 1e9 + 7;
        int n = nums.length + 1;
        long[] pow = new long[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (2 * pow[i - 1]) % mod;
        }
        for (int num : nums) {
            numCnt[num]++;
        }
        for (int i = 1; i < prefixCnt.length; i++) {
            prefixCnt[i] = prefixCnt[i - 1] + numCnt[i - 1];
        }
        for (int i = postfixCnt.length - 2; i > 0; i--) {
            postfixCnt[i] = postfixCnt[i + 1] + numCnt[i + 1];
        }
        long result = 0;
        for (int num : nums) {
            if (numCnt[num] != -1) {
                result += (num * (pow[prefixCnt[num]] * (pow[numCnt[num]] - 1))) % mod;
                result -= (num * (pow[postfixCnt[num]] * (pow[numCnt[num]] - 1))) % mod;
                result %= mod;
                numCnt[num] = -1;
            }
        }
        result = (result + mod) % mod;
        return (int) result;
    }
}
