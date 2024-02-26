package g2801_2900.s2848_points_that_intersect_with_cars;

// #Easy #Hash_Table #Math #Prefix_Sum #2023_12_13_Time_1_ms_(100.00%)_Space_43.8_MB_(11.45%)

import java.util.List;

public class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int min = 101;
        int max = 0;
        int[] count = new int[102];
        for (List<Integer> list : nums) {
            int num1 = list.get(0);
            int num2 = list.get(1);

            if (num1 < min) {
                min = num1;
            }
            if (num2 > max) {
                max = num2;
            }

            count[num1]--;
            count[num2 + 1]++;
        }

        int result = 0;
        int balance = 0;
        for (; min <= max; min++) {
            balance += count[min];
            if (balance < 0) {
                result++;
            }
        }
        return result;
    }
}
