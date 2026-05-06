package g3701_3800.s3780_maximum_sum_of_three_numbers_divisible_by_three;

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Senior #Biweekly_Contest_172
// #2026_05_06_Time_7_ms_(98.17%)_Space_168.14_MB_(89.91%)

public class Solution {
    public int maximumSum(int[] nums) {
        int[][] group = new int[3][3];
        for (int num : nums) {
            int m = num % 3;
            int max1 = group[m][0];
            int max2 = group[m][1];
            int max3 = group[m][2];
            if (num >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num >= max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
            group[m][0] = max1;
            group[m][1] = max2;
            group[m][2] = max3;
        }
        int res = 0;
        for (int[] g : group) {
            int sum = 0;
            for (int i = 0; i < 3; i += 1) {
                if (g[i] == 0) {
                    sum = 0;
                    break;
                }
                sum += g[i];
            }
            res = Math.max(res, sum);
        }
        int max = 0;
        for (int[] g : group) {
            if (g[0] == 0) {
                max = 0;
                break;
            }
            max += g[0];
        }
        res = Math.max(res, max);
        return res;
    }
}
