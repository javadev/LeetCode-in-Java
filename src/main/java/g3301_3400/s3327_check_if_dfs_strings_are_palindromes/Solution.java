package g3301_3400.s3327_check_if_dfs_strings_are_palindromes;

// #Hard #2024_10_21_Time_244_ms_(100.00%)_Space_96.3_MB_(100.00%)

import java.util.ArrayList;

public class Solution {
    private StringBuilder dfsString;

    private int[] fillManacher(String s) {
        int n = s.length();
        s = "$" + s + "@";
        int[] p = new int[n + 2];
        int center = 0;
        int right = 0;
        for (int i = 1; i <= n; i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }
            while (s.charAt(i + p[i]) == s.charAt(i - p[i])) {
                p[i]++;
            }
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }
        return p;
    }

    private int[] manacher() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < dfsString.length(); i++) {
            temp.append("#");
            temp.append(dfsString.charAt(i));
        }
        temp.append("#");
        return fillManacher(String.valueOf(temp));
        // return Arrays.copyOfRange(arr, 1, arr.length - 1);
    }

    private void dfs(
            int node, int parent, ArrayList<ArrayList<Integer>> adj, int[][] range, String s) {
        int start = dfsString.length();

        for (int neigh : adj.get(node)) {
            if (neigh == parent) {
                continue;
            }
            dfs(neigh, node, adj, range, s);
        }
        dfsString.append(s.charAt(node));
        int end = dfsString.length() - 1;
        range[node] = new int[] {start, end};
    }

    public boolean[] findAnswer(int[] parent, String s) {
        dfsString = new StringBuilder();
        int n = parent.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) {
                continue;
            }
            adj.get(parent[i]).add(i);
        }
        int[][] range = new int[n][2];
        dfs(0, -1, adj, range, s);
        int[] manacherArr = manacher();
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; i++) {
            int[] currRange = range[i];
            int length = currRange[1] - currRange[0] + 1;
            // +2 because the string has $# in the starting and in the end
            int palindromeStart = 2 * currRange[0] + 2;
            int palindromeEnd = 2 * currRange[1] + 2;
            int center = (palindromeStart + palindromeEnd) / 2;
            // represents the palindrome length having center at center.
            int palindromeLength = manacherArr[center];
            ans[i] = palindromeLength >= length;
        }
        return ans;
    }
}
