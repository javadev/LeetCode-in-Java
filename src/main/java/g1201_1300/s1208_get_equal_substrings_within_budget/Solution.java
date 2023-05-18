package g1201_1300.s1208_get_equal_substrings_within_budget;

// #Medium #String #Binary_Search #Prefix_Sum #Sliding_Window
// #2022_03_09_Time_7_ms_(73.41%)_Space_43.3_MB_(45.62%)

public class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0;
        int end = 0;
        int currCost = 0;
        int maxLength = Integer.MIN_VALUE;
        while (end < s.length()) {
            currCost += Math.abs(s.charAt(end) - t.charAt(end));
            while (currCost > maxCost) {
                currCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            if (end - start + 1 > maxLength) {
                maxLength = Math.max(end - start + 1, maxLength);
            }
            end++;
        }
        return maxLength;
    }
}
