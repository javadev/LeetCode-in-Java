package g3601_3700.s3678_smallest_absent_positive_greater_than_average;

// #Easy #Biweekly_Contest_165 #2025_09_20_Time_2_ms_(100.00%)_Space_45.28_MB_(53.71%)

public class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        for (int j : nums) {
            sum += j;
        }
        double avg = (double) sum / nums.length;
        int num;
        if (avg < 0) {
            num = 1;
        } else {
            num = (int) avg + 1;
        }
        while (true) {
            boolean flag = false;
            for (int j : nums) {
                if (num == j) {
                    flag = true;
                    break;
                }
            }
            if (!flag && num > avg) {
                return num;
            }
            num++;
        }
    }
}
