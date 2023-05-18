package g0701_0800.s0761_special_binary_string;

// #Hard #String #Recursion #2022_03_25_Time_1_ms_(100.00%)_Space_40.2_MB_(86.57%)

import java.util.PriorityQueue;

public class Solution {
    public String makeLargestSpecial(String s) {
        if (s == null || s.length() == 0 || s.length() == 2) {
            return s;
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        int acc = 1;
        int prev = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (acc == 0) {
                if (!(prev == 0 && i == s.length())) {
                    pq.add(makeLargestSpecial(s.substring(prev, i)));
                }
                prev = i;
            }
            if (i == s.length()) {
                break;
            }
            if (s.charAt(i) == '1') {
                acc++;
            } else {
                acc--;
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            ans.append(pq.poll());
        }
        if (ans.length() == 0) {
            ans.append('1');
            ans.append(makeLargestSpecial(s.substring(1, s.length() - 1)));
            ans.append('0');
        }
        return ans.toString();
    }
}
