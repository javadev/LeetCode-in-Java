package g0101_0200.s0179_largest_number;

// #Medium #Top_Interview_Questions #String #Sorting #Greedy
// #2022_06_26_Time_10_ms_(54.50%)_Space_43.6_MB_(59.08%)

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
