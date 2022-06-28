package g0201_0300.s0205_isomorphic_strings;

// #Easy #String #Hash_Table #Level_1_Day_2_String
// #2022_06_28_Time_2_ms_(99.97%)_Space_43.3_MB_(32.68%)

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map = new int[128];
        char[] str = s.toCharArray();
        char[] tar = t.toCharArray();
        int n = str.length;
        for (int i = 0; i < n; i++) {
            if (map[tar[i]] == 0) {
                if (search(map, str[i], tar[i]) != -1) {
                    return false;
                }
                map[tar[i]] = str[i];
            } else {
                if (map[tar[i]] != str[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private int search(int[] map, int tar, int skip) {
        for (int i = 0; i < 128; i++) {
            if (i == skip) {
                continue;
            }
            if (map[i] != 0 && map[i] == tar) {
                return i;
            }
        }
        return -1;
    }
}
