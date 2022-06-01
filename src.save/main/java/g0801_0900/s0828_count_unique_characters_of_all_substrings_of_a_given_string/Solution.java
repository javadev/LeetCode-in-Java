package g0801_0900.s0828_count_unique_characters_of_all_substrings_of_a_given_string;

// #Hard #String #Dynamic_Programming #2022_03_24_Time_101_ms_(18.42%)_Space_69_MB_(14.84%)

import java.util.HashMap;

public class Solution {
    public int uniqueLetterString(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] left = new int[s.length()];
        int[] right = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.putIfAbsent(c, -1);
            left[i] = map.get(c);
            map.put(c, i);
        }
        map.clear();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            map.putIfAbsent(c, s.length());
            right[i] = map.get(c);
            map.put(c, i);
        }

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int numOfLeft = i - left[i];
            int numOfRight = right[i] - i;
            res += (numOfLeft * numOfRight);
        }
        return res;
    }
}
