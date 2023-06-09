package g1001_1100.s1061_lexicographically_smallest_equivalent_string;

// #Medium #String #Union_Find #2023_06_09_Time_2_ms_(93.75%)_Space_41.7_MB_(41.30%)

public class Solution {
    private int[] parent;

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        parent = new int[26];
        int n = s1.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n; i++) {
            union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }
        char base = 'a';
        for (char element : baseStr.toCharArray()) {
            result.append(Character.toString(base + find(element - 'a')));
        }
        return result.toString();
    }

    private void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if (parentA != parentB) {
            if (parentA < parentB) {
                parent[parentB] = parentA;
            } else {
                parent[parentA] = parentB;
            }
        }
    }

    private int find(int x) {
        while (parent[x] != x) {
            x = parent[x];
        }
        return x;
    }
}
