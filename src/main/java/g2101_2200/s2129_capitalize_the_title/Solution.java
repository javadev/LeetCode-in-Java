package g2101_2200.s2129_capitalize_the_title;

// #Easy #String #2022_06_03_Time_2_ms_(94.22%)_Space_42.5_MB_(71.58%)

public class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < title.length()) {
            while (j < title.length() && title.charAt(j) != ' ') {
                sb.append(Character.toLowerCase(title.charAt(j)));
                j++;
            }
            int len = j - i;
            if (len > 2) {
                sb.setCharAt(i, Character.toUpperCase(title.charAt(i)));
            }
            if (j == title.length()) {
                break;
            }
            sb.append(title.charAt(j));
            i = ++j;
        }
        return sb.toString();
    }
}
