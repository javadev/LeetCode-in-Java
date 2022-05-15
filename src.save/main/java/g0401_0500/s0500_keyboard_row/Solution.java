package g0401_0500.s0500_keyboard_row;

// #Easy #Array #String #Hash_Table #Acceptance_68.1%
// #2022_03_19_Time_0_ms_(100.00%)_Space_42.1_MB_(35.04%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private boolean check(String str, String word) {
        for (char ch : word.toCharArray()) {
            if (str.indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
    }

    public String[] findWords(String[] words) {
        List<String> arr = new ArrayList<>();
        for (String word : words) {
            String w = word.toLowerCase();
            if (check("qwertyuiop", w) || check("asdfghjkl", w) || check("zxcvbnm", w)) {
                arr.add(word);
            }
        }
        String[] ans = new String[arr.size()];
        ans = arr.toArray(ans);
        return ans;
    }
}
