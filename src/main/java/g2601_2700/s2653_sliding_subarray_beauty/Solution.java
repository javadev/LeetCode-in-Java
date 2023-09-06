package g2601_2700.s2653_sliding_subarray_beauty;

// #Medium #Array #Hash_Table #Sliding_Window #2023_09_06_Time_33_ms_(86.67%)_Space_60.4_MB_(44.44%)

@SuppressWarnings("java:S135")
public class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] arr = new int[101];
        int j = 0;
        int[] ans = new int[nums.length - k + 1];
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] + 50]++;
            if (i < k - 1) {
                continue;
            }
            if (ind > 0 && ans[ind - 1] < nums[i] && ans[ind - 1] < nums[j - 1]) {
                arr[nums[j++] + 50]--;
                ans[ind] = ans[ind - 1];
                ind++;
                continue;
            }
            int count = 0;
            int si = -1;
            while (count < x) {
                si++;
                if (arr[si] != 0) {
                    count += arr[si];
                }
            }
            arr[nums[j++] + 50]--;
            ans[ind++] = (si - 50 < 1) ? si - 50 : 0;
        }
        return ans;
    }
}
