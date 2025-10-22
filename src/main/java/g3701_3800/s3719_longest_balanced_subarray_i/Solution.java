package g3701_3800.s3719_longest_balanced_subarray_i;

// #Medium #Array #Hash_Table #Prefix_Sum #Divide_and_Conquer #Segment_Tree #Weekly_Contest_472
// #2025_10_22_Time_10_ms_(100.00%)_Space_45.12_MB_(71.74%)

public class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxVal = 0;
        for (int v : nums) {
            if (v > maxVal) {
                maxVal = v;
            }
        }
        int[] evenMark = new int[maxVal + 1];
        int[] oddMark = new int[maxVal + 1];
        int stampEven = 0;
        int stampOdd = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (n - i <= ans) {
                break;
            }
            stampEven++;
            stampOdd++;
            int distinctEven = 0;
            int distinctOdd = 0;
            for (int j = i; j < n; j++) {
                int v = nums[j];
                if ((v & 1) == 0) {
                    if (evenMark[v] != stampEven) {
                        evenMark[v] = stampEven;
                        distinctEven++;
                    }
                } else {
                    if (oddMark[v] != stampOdd) {
                        oddMark[v] = stampOdd;
                        distinctOdd++;
                    }
                }
                if (distinctEven == distinctOdd) {
                    int len = j - i + 1;
                    if (len > ans) {
                        ans = len;
                    }
                }
            }
        }
        return ans;
    }
}
