package g0001_0100.s0066_plus_one;

// #Easy #Top_Interview_Questions #Array #Math #Programming_Skills_II_Day_3 #Udemy_Arrays
// #Top_Interview_150_Math #2025_03_05_Time_0_ms_(100.00%)_Space_41.78_MB_(81.75%)

public class Solution {
    public int[] plusOne(int[] digits) {
        int num = 1;
        int carry = 0;
        int sum;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                sum = digits[i] + carry + num;
            } else {
                sum = digits[i] + carry;
            }
            carry = sum / 10;
            digits[i] = sum % 10;
        }
        if (carry != 0) {
            int[] ans = new int[digits.length + 1];
            ans[0] = carry;
            System.arraycopy(digits, 0, ans, 1, ans.length - 1);
            return ans;
        }
        return digits;
    }
}
