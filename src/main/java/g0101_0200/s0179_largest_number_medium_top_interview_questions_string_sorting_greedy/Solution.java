package g0101_0200.s0179_largest_number_medium_top_interview_questions_string_sorting_greedy;

import java.util.Arrays;

public class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;
    }
}
