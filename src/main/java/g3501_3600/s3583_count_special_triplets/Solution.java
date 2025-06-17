package g3501_3600.s3583_count_special_triplets;

// #Medium #Array #Hash_Table #Counting #2025_06_17_Time_30_ms_(99.81%)_Space_60.90_MB_(89.67%)

public class Solution {
    public int specialTriplets(int[] nums) {
        long ans = 0;
        int[] sum = new int[200002];
        int[] left = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            sum[curr]++;
            left[i] = sum[curr * 2];
        }
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            long leftCount = curr == 0 ? left[i] - 1 : left[i];
            long rightCount = sum[curr * 2] - (long) left[i];
            if (leftCount != 0 && rightCount != 0) {
                ans += leftCount * rightCount;
            }
        }
        return (int) (ans % 1000000007);
    }
}
