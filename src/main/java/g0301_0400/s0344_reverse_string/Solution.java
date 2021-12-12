package g0301_0400.s0344_reverse_string;

// #Easy #Top_Interview_Questions #String #Two_Pointers #Recursion

public class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
