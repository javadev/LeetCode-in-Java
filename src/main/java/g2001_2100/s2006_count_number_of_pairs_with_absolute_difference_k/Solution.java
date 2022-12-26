package g2001_2100.s2006_count_number_of_pairs_with_absolute_difference_k;

// #Easy #Array #Hash_Table #Counting #2022_05_23_Time_8_ms_(58.60%)_Space_42.2_MB_(74.50%)

public class Solution {
    public int countKDifference(int[] nums, int k) {
        int pairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
