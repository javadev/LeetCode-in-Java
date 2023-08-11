package g0801_0900.s0899_orderly_queue;

// #Hard #String #Math #Sorting #2022_03_28_Time_1_ms_(100.00%)_Space_40.5_MB_(98.64%)

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String orderlyQueue(String s, int k) {
        if (k > 1) {
            char[] ans = s.toCharArray();
            Arrays.sort(ans);
            return String.valueOf(ans);
        }
        char min = 'z';
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (cc < min) {
                min = cc;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == min) {
                list.add(i);
            }
        }
        String ans = s;
        for (Integer integer : list) {
            String after = s.substring(0, integer);
            String before = s.substring(integer);
            String f = before + after;
            if (f.compareTo(ans) < 0) {
                ans = f;
            }
        }
        return ans;
    }
}
