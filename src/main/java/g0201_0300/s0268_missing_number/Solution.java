package g0201_0300.s0268_missing_number;

// #Easy #Top_Interview_Questions #Array #Hash_Table #Math #Sorting #Bit_Manipulation

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
