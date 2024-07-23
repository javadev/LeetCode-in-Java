package g3201_3300.s3224_minimum_array_changes_to_make_differences_equal;

// #Medium #Array #Hash_Table #Prefix_Sum #2024_07_23_Time_4_ms_(100.00%)_Space_58.4_MB_(41.64%)

public class Solution {
    public int minChanges(int[] nums, int k) {
        int[] cm = new int[k + 2];
        for (int i = 0; i < nums.length / 2; i++) {
            int a = Math.min(nums[i], nums[nums.length - 1 - i]);
            int b = Math.max(nums[i], nums[nums.length - 1 - i]);
            int d = b - a;
            if (d > 0) {
                cm[0]++;
                cm[d]--;
                cm[d + 1]++;
                int max = Math.max(a, k - b) + d;
                cm[max + 1]++;
            } else {
                cm[1]++;
                int max = Math.max(a, k - a);
                cm[max + 1]++;
            }
        }
        int sum = cm[0];
        int res = cm[0];
        for (int i = 1; i <= k; i++) {
            sum += cm[i];
            res = Math.min(res, sum);
        }
        return res;
    }
}
