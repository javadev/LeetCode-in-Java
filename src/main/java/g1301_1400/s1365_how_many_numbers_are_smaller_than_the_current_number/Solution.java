package g1301_1400.s1365_how_many_numbers_are_smaller_than_the_current_number;

// #Easy #Array #Hash_Table #Sorting #Counting #2022_05_16_Time_1_ms_(99.78%)_Space_45_MB_(22.25%)

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] temp = new int[101];
        for (int num : nums) {
            temp[num]++;
        }
        for (int i = 1; i < 101; i++) {
            temp[i] += temp[i - 1];
        }
        for (int i = 0; i < ans.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = temp[nums[i] - 1];
            }
        }
        return ans;
    }
}
