package g1901_2000.s1957_delete_characters_to_make_fancy_string;

// #Easy #String #2022_05_18_Time_54_ms_(52.94%)_Space_67.8_MB_(72.35%)

public class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int c = 1;
        ans.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                c++;
            } else {
                c = 1;
            }
            if (c < 3) {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
