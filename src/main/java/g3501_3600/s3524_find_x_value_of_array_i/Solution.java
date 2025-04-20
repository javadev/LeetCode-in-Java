package g3501_3600.s3524_find_x_value_of_array_i;

// #Medium #2025_04_20_Time_12_ms_(95.41%)_Space_60.78_MB_(18.55%)

public class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] res = new long[k];
        int[] cnt = new int[k];
        for (int a : nums) {
            int[] cnt2 = new int[k];
            for (int i = 0; i < k; i++) {
                int v = (int) (((long) i * a) % k);
                cnt2[v] += cnt[i];
                res[v] += cnt[i];
            }
            cnt = cnt2;
            cnt[a % k]++;
            res[a % k]++;
        }
        return res;
    }
}
