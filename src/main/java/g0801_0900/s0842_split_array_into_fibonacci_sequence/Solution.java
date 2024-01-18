package g0801_0900.s0842_split_array_into_fibonacci_sequence;

// #Medium #String #Backtracking #2022_03_24_Time_4_ms_(62.81%)_Space_43.6_MB_(32.65%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S5413")
public class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> res = new ArrayList<>();
        solve(num, res, 0);
        return res;
    }

    private boolean solve(String s, List<Integer> res, int idx) {
        if (idx == s.length() && res.size() >= 3) {
            return true;
        }
        for (int i = idx; i < s.length(); i++) {
            if (s.charAt(idx) == '0' && i > idx) {
                return false;
            }
            long num = Long.parseLong(s.substring(idx, i + 1));
            if (num > Integer.MAX_VALUE) {
                return false;
            }
            int size = res.size();
            if (size >= 2 && num > res.get(size - 1) + res.get(size - 2)) {
                return false;
            }
            if (size <= 1 || num == res.get(size - 1) + res.get(size - 2)) {
                res.add((int) num);
                if (solve(s, res, i + 1)) {
                    return true;
                }
                res.remove(res.size() - 1);
            }
        }
        return false;
    }
}
