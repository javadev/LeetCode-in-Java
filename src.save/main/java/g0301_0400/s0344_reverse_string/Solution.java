package g0301_0400.s0344_reverse_string;

// #Easy #Top_Interview_Questions #String #Two_Pointers #Recursion #Algorithm_I_Day_4_Two_Pointers
// #Udemy_Strings #2022_03_15_Time_1_ms_(87.94%)_Space_54.6_MB_(42.01%)

public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
