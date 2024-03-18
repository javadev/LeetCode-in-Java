package g0201_0300.s0287_find_the_duplicate_number;

// #Medium #Top_100_Liked_Questions #Array #Binary_Search #Two_Pointers #Bit_Manipulation
// #Binary_Search_II_Day_5 #Big_O_Time_O(n)_Space_O(n)
// #2022_07_06_Time_2_ms_(99.82%)_Space_61.1_MB_(83.92%)

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
