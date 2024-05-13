package g0901_1000.s0990_satisfiability_of_equality_equations;

// #Medium #Array #String #Graph #Union_Find #2024_05_13_Time_0_ms_(100.00%)_Space_41.9_MB_(47.21%)

public class Solution {
    private int[] parent = new int[26];

    private int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        parent[x] = find(parent[x]);
        return parent[x];
    }

    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (String e : equations) {
            if (e.charAt(1) == '=') {
                parent[find(e.charAt(0) - 'a')] = find(e.charAt(3) - 'a');
            }
        }
        for (String e : equations) {
            if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a')) {
                return false;
            }
        }
        return true;
    }
}
