package g0201_0300.s0268_missing_number;

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
