package g2401_2500.s2430_maximum_deletions_on_a_string;

// #Hard #String #Dynamic_Programming #Hash_Function #String_Matching #Rolling_Hash
// #2022_12_07_Time_159_ms_(93.39%)_Space_42.7_MB_(79.28%)

import java.util.HashMap;

public class Solution {
    private String s;
    private int[] hash;
    private int[] pows;
    private HashMap<Integer, Integer> visited;

    public int deleteString(String s) {
        this.s = s;
        if (isBad()) {
            return s.length();
        }
        visited = new HashMap<>();
        fill();

        return helper(0, 1, 0, 1);
    }

    private int helper(int a, int b, int id1, int id2) {
        int mask = (id1 << 12) + id2;
        int ans = 1;
        if (visited.containsKey(mask)) {
            return visited.get(mask);
        }
        for (; b < s.length(); a++, id2++, b += 2) {
            if ((hash[a + 1] - hash[id1]) * pows[id2] == (hash[b + 1] - hash[id2]) * pows[id1]) {
                if (id2 + 1 == s.length()) {
                    ans = Math.max(ans, 2);
                } else {
                    ans = Math.max(ans, 1 + helper(id2, id2 + 1, id2, id2 + 1));
                }
            }
        }
        visited.put(mask, ans);
        return ans;
    }

    private void fill() {
        int n = s.length();
        hash = new int[n + 1];
        pows = new int[n];
        pows[0] = 1;
        hash[1] = s.charAt(0);
        for (int i = 1; i != n; i++) {
            int temp = pows[i] = pows[i - 1] * 1000000007;
            hash[i + 1] = s.charAt(i) * temp + hash[i];
        }
    }

    private boolean isBad() {
        int i = 1;
        while (i < s.length()) {
            if (s.charAt(0) != s.charAt(i++)) {
                return false;
            }
        }
        return true;
    }
}
