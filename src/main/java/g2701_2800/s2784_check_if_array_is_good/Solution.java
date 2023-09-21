package g2701_2800.s2784_check_if_array_is_good;

// #Easy #Array #Hash_Table #Sorting #2023_09_21_Time_1_ms_(99.49%)_Space_41.2_MB_(98.36%)

public class Solution {
    public boolean isGood(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            sum += i;
        }
        if (max != nums.length - 1) {
            return false;
        }
        int newSum = max * (max + 1) / 2 + max;
        if (sum != newSum) {
            return false;
        }
        int count = 0;
        for (int i : nums) {
            if (i == max) {
                count++;
            }
        }
        return count == 2;
    }
}
