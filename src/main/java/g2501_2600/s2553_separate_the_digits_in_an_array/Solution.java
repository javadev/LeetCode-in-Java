package g2501_2600.s2553_separate_the_digits_in_an_array;

// #Easy #Array #Simulation #2023_08_18_Time_3_ms_(92.00%)_Space_43.7_MB_(93.70%)

public class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder str = new StringBuilder();
        for (int num : nums) {
            str.append(num);
        }
        int[] ar = new int[str.length()];
        String s = str.toString();
        for (int i = 0; i < s.length(); i++) {
            ar[i] = s.charAt(i) - '0';
        }
        return ar;
    }
}
