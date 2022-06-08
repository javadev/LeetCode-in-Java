package g2101_2200.s2167_minimum_time_to_remove_all_cars_containing_illegal_goods;

// #Hard #String #Dynamic_Programming #2022_06_08_Time_46_ms_(61.00%)_Space_82.5_MB_(26.00%)

public class Solution {
    public int minimumTime(String s) {
        final int n = s.length();
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            sum[i + 1] = sum[i] + (s.charAt(i) - '0');
        }
        if (sum[n] == 0) {
            return 0;
        }
        int res = s.length();
        int min = Integer.MAX_VALUE;
        for (int end = 0; end < n; ++end) {
            min = Math.min(min, end - 2 * sum[end] + n - 1);
            res = Math.min(res, min + 2 * sum[end + 1] - end);
        }
        return res;
    }
}
