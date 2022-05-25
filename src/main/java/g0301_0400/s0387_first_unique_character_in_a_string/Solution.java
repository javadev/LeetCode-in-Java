package g0301_0400.s0387_first_unique_character_in_a_string;

// #Easy #Top_Interview_Questions #String #Hash_Table #Counting #Queue
// #Data_Structure_I_Day_6_String #2022_03_16_Time_2_ms_(99.53%)_Space_48.4_MB_(64.14%)

public class Solution {
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            int ind = s.indexOf(i);
            if (ind != -1 && ind == s.lastIndexOf(i)) {
                ans = Math.min(ans, ind);
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}
