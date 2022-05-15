package g0201_0300.s0287_find_the_duplicate_number;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search #Two_Pointers
// #Bit_Manipulation #Acceptance_58.8% #Binary_Search_II_Day_5
// #2022_03_14_Time_4_ms_(94.82%)_Space_76.1_MB_(27.41%)

public class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            arr[num] += 1;
            if (arr[num] == 2) {
                return num;
            }
        }
        return 0;
    }
}
