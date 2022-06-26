package g0201_0300.s0268_missing_number;

// #Easy #Top_Interview_Questions #Array #Hash_Table #Math #Sorting #Binary_Search #Bit_Manipulation
// #2022_03_14_Time_0_ms_(100.00%)_Space_51.1_MB_(42.73%)

public class Solution {
    public int missingNumber(int[] nums) {
        int a = nums.length;
        for (int i = 0; i < nums.length; i++) {
            a ^= i;
            a ^= nums[i];
        }
        return a;
    }
}
