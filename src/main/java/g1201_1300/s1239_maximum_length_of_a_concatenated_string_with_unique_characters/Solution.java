package g1201_1300.s1239_maximum_length_of_a_concatenated_string_with_unique_characters;

// #Medium #Array #String #Bit_Manipulation #Backtracking
// #2022_03_12_Time_9_ms_(88.28%)_Space_45.3_MB_(68.10%)

import java.util.List;

public class Solution {
    public int maxLength(List<String> arr) {
        return find(0, 0, arr);
    }

    private int find(int index, int visChar, List<String> arr) {
        if (index == arr.size()) {
            return 0;
        }
        int ans = 0;
        ans = Math.max(ans, find(index + 1, visChar, arr));
        if (checkCurrStringValidOrNot(visChar, arr.get(index))) {
            visChar = updateState(visChar, arr.get(index));
            ans = Math.max(ans, arr.get(index).length() + find(index + 1, visChar, arr));
        }
        return ans;
    }

    private boolean checkCurrStringValidOrNot(int vis, String s) {
        for (char c : s.toCharArray()) {
            if ((vis & (1 << (c - 'a'))) != 0) {
                return false;
            }
            vis |= (1 << (c - 'a'));
        }
        return true;
    }

    private int updateState(int vis, String s) {
        for (char c : s.toCharArray()) {
            vis |= (1 << (c - 'a'));
        }
        return vis;
    }
}
