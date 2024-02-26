package g1501_1600.s1512_number_of_good_pairs;

// #Easy #Array #Hash_Table #Math #Counting #2022_04_09_Time_1_ms_(84.97%)_Space_42.2_MB_(9.05%)

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
