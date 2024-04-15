package g0001_0100.s0014_longest_common_prefix;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #String #Level_2_Day_2_String
// #Udemy_Strings #2024_02_11_Time_0_ms_(100.00%)_Space_42_MB_(19.08%)

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String temp = strs[0];
        int i = 1;
        String cur;
        while (temp.length() > 0 && i < strs.length) {
            if (temp.length() > strs[i].length()) {
                temp = temp.substring(0, strs[i].length());
            }
            cur = strs[i].substring(0, temp.length());
            if (!cur.equals(temp)) {
                temp = temp.substring(0, temp.length() - 1);
            } else {
                i++;
            }
        }
        return temp;
    }
}
