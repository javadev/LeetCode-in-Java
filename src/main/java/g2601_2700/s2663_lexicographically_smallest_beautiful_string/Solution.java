package g2601_2700.s2663_lexicographically_smallest_beautiful_string;

// #Hard #String #Greedy #2023_09_09_Time_8_ms_(90.48%)_Space_44.5_MB_(85.71%)

public class Solution {
    public String smallestBeautifulString(String s, int k) {
        int n = s.length();
        char[] chars = s.toCharArray();
        for (int i = n - 1; i >= 0; i--) {
            chars[i]++;
            while (chars[i] <= 'a' + k - 1 && isValid(chars, i)) {
                chars[i]++;
            }
            if (chars[i] <= 'a' + k - 1) {
                for (int j = i + 1; j < n; j++) {
                    chars[j] = 'a';
                    while (isValid(chars, j)) {
                        chars[j]++;
                    }
                }
                return new String(chars);
            }
        }
        return "";
    }

    private boolean isValid(char[] s, int i) {
        return (i - 1 >= 0 && s[i - 1] == s[i]) || (i - 2 >= 0 && s[i - 2] == s[i]);
    }
}
