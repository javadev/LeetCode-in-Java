package g0201_0300.s0287_find_the_duplicate_number;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search #Two_Pointers
// #Bit_Manipulation #2022_03_14_Time_4_ms_(94.82%)_Space_76.1_MB_(27.41%)

public class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            arr[nums[i]] += 1;
            if (arr[nums[i]] == 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
