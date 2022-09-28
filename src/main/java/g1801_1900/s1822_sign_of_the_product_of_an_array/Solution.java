package g1801_1900.s1822_sign_of_the_product_of_an_array;

// #Easy #Array #Math #Programming_Skills_I_Day_4_Loop
// #2022_05_06_Time_1_ms_(58.05%)_Space_44.1_MB_(44.59%)

public class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        return negativeCount % 2 == 0 ? 1 : -1;
    }
}
