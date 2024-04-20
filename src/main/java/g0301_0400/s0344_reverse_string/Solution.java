package g0301_0400.s0344_reverse_string;

// #Easy #String #Two_Pointers #Recursion #Algorithm_I_Day_4_Two_Pointers #Udemy_Strings
// #2022_07_11_Time_1_ms_(99.91%)_Space_54.4_MB_(64.26%)

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
