package g0401_0500.s0488_zuma_game;

// #Hard #String #Dynamic_Programming #Breadth_First_Search #Memoization
// #2022_07_13_Time_1989_ms_(32.79%)_Space_56.5_MB_(81.97%)

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Solution {
    private HashMap<String, Integer> map = new HashMap<>();

    private String removeConsecutiveThreeOrMoreBalls(String board) {
        Deque<Character> st = new ArrayDeque<>();
        int n = board.length();
        for (int i = 0; i < n; i++) {
            char ch = board.charAt(i);
            st.push(ch);
            if (st.size() >= 3 && (i == n - 1 || ch != board.charAt(i + 1))) {
                char a = st.pop();
                char b = st.pop();
                char c = st.pop();
                if (a == b && b == c) {
                    while (!st.isEmpty() && st.peek() == a) {
                        st.pop();
                    }
                } else {
                    st.push(c);
                    st.push(b);
                    st.push(a);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        return res.reverse().toString();
    }

    private String ss(String s, int i, int j) {
        return s.substring(i, j);
    }

    private int solve(String board, String hand) {
        String key = board + "#" + hand;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        board = removeConsecutiveThreeOrMoreBalls(board);
        int ans = 100;
        int n = board.length();
        int m = hand.length();
        if (n == 0 || m == 0) {
            map.put(key, n == 0 ? 0 : 100);
            return n == 0 ? 0 : 100;
        }
        for (int i = 0; i < hand.length(); i++) {
            for (int j = 0; j < n; j++) {
                if (board.charAt(j) == hand.charAt(i)
                        || (j < n - 1 && board.charAt(j) == board.charAt(j + 1))) {
                    ans =
                            Math.min(
                                    ans,
                                    1
                                            + solve(
                                                    ss(board, 0, j + 1)
                                                            + hand.charAt(i)
                                                            + ss(board, j + 1, n),
                                                    ss(hand, 0, i) + ss(hand, i + 1, m)));
                }
            }
        }
        map.put(key, ans);
        return ans;
    }

    public int findMinStep(String board, String hand) {
        int ans = solve(board, hand);
        return ans >= 100 ? -1 : ans;
    }
}
