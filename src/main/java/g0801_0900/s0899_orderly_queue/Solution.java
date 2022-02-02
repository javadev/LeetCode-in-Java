package g0801_0900.s0899_orderly_queue;

// #Hard #String #Math #Sorting

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
            if (s.charAt(i) == min) list.add(i);
        }
        String ans = s;
        for (int i = 0; i < list.size(); i++) {
            String after = s.substring(0, list.get(i));
            String before = s.substring(list.get(i));
            String f = before + after;

            if (f.compareTo(ans) < 0) {
                ans = f;
            }
        }
        return ans;
    }
}
