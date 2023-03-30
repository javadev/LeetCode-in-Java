package g2001_2100.s2002_maximum_product_of_the_length_of_two_palindromic_subsequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("java:S135")
public class Solution {
    public int maxProduct(String s) {
        if (s.length() == 2) {
            return 1;
        }
        List<State> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        Set<State> visited = new HashSet<>();
        for (int i = 0; i < chars.length; ++i) {
            int mask = 1 << i;
            recur(chars, new State(i, i, 0, mask, chars, visited), list);
            recur(chars, new State(i, i + 1, 0, mask, chars, visited), list);
        }
        list.sort((a, b) -> b.cnt - a.cnt);
        int res = 1;
        Set<Integer> explored = new HashSet<>();
        for (int i = 0; i < list.size() - 1; ++i) {
            if (explored.contains(i)) {
                continue;
            }
            State cur = list.get(i);
            if (cur.cnt == 1) {
                break;
            }
            for (int j = i + 1; j < list.size(); ++j) {
                State cand = list.get(j);
                if ((cur.mask & cand.mask) < 1) {
                    if (explored.add(j)) {
                        res = Math.max(res, cur.cnt * cand.cnt);
                    }
                    break;
                }
            }
        }
        return res;
    }

    private void recur(char[] chars, State s, List<State> list) {
        if (s.i < 0 || s.j >= chars.length) {
            return;
        }
        if (!s.visited.add(s)) {
            return;
        }
        if (chars[s.i] == chars[s.j]) {
            int m = s.mask | (1 << s.i) | (1 << s.j);
            int nextCnt = s.cnt + (s.i < s.j ? 2 : 1);
            list.add(new State(s.i, s.j, nextCnt, m, chars, s.visited));
            recur(chars, new State(s.i - 1, s.j + 1, nextCnt, m, chars, s.visited), list);
        }
        recur(chars, new State(s.i - 1, s.j, s.cnt, s.mask, chars, s.visited), list);
        recur(chars, new State(s.i, s.j + 1, s.cnt, s.mask, chars, s.visited), list);
    }
}

