package g1201_1300.s1262_greatest_sum_divisible_by_three;

// #Medium #Array #Dynamic_Programming #Greedy #2022_03_13_Time_5_ms_(95.82%)_Space_54_MB_(52.09%)

public class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int smallest_num_with_mod_1 = 10001;
        int second_smallest_num_with_mod_1 = 10002;
        int smallest_num_with_mod_2 = 10001;
        int second_smallest_num_with_mod_2 = 10002;
        for (int i : nums) {
            sum += i;
            if (i % 3 == 1) {
                if (i <= smallest_num_with_mod_1) {
                    int temp = smallest_num_with_mod_1;
                    smallest_num_with_mod_1 = i;
                    second_smallest_num_with_mod_1 = temp;
                } else if (i < second_smallest_num_with_mod_1) {
                    second_smallest_num_with_mod_1 = i;
                }
            }
            if (i % 3 == 2) {
                if (i <= smallest_num_with_mod_2) {
                    int temp = smallest_num_with_mod_2;
                    smallest_num_with_mod_2 = i;
                    second_smallest_num_with_mod_2 = temp;
                } else if (i < second_smallest_num_with_mod_2) {
                    second_smallest_num_with_mod_2 = i;
                }
            }
        }
        if (sum % 3 == 0) {
            return sum;
        } else if (sum % 3 == 2) {
            int min =
                    Math.min(
                            smallest_num_with_mod_2,
                            smallest_num_with_mod_1 + second_smallest_num_with_mod_1);
            return sum - min;
        } else if (sum % 3 == 1) {
            int min =
                    Math.min(
                            smallest_num_with_mod_1,
                            smallest_num_with_mod_2 + second_smallest_num_with_mod_2);
            return sum - min;
        }
        return sum;
    }
}
