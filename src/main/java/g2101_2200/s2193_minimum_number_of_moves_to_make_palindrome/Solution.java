package g2101_2200.s2193_minimum_number_of_moves_to_make_palindrome;

// #Hard #String #Greedy #Two_Pointers #Binary_Indexed_Tree
// #2022_06_02_Time_8_ms_(98.76%)_Space_40.8_MB_(96.27%)

public class Solution {
    public int minMovesToMakePalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] charArray = s.toCharArray();
        int output = 0;
        while (l < r) {
            if (charArray[l] != charArray[r]) {
                char prev = charArray[l];
                int k = r;
                while (charArray[k] != prev) {
                    k--;
                }
                // middle element
                if (k == l) {
                    char temp = charArray[l];
                    charArray[l] = charArray[l + 1];
                    charArray[l + 1] = temp;
                    output++;
                    continue;
                }
                for (int i = k; i < r; i++) {
                    char temp = charArray[i];
                    charArray[i] = charArray[i + 1];
                    charArray[i + 1] = temp;
                    output++;
                }
            }
            l++;
            r--;
        }
        return output;
    }
}
