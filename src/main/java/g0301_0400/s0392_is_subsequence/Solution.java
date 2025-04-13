package g0301_0400.s0392_is_subsequence;

// #Easy #String #Dynamic_Programming #Two_Pointers #LeetCode_75_Two_Pointers
// #Dynamic_Programming_I_Day_19 #Level_1_Day_2_String #Udemy_Two_Pointers
// #Top_Interview_150_Two_Pointers #2025_03_09_Time_1_ms_(93.13%)_Space_41.65_MB_(37.86%)

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int n = t.length();
        int m = s.length();
        if (m == 0) {
            return true;
        }
        while (j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == m) {
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}
