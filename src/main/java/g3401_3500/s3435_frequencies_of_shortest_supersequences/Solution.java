package g3401_3500.s3435_frequencies_of_shortest_supersequences;

// #Hard #Array #String #Bit_Manipulation #Graph #Enumeration #Topological_Sort
// #2025_01_29_Time_16_(95.35%)_Space_45.52_(93.02%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private int m;
    private int forcedMask;
    private int[] adj;
    private char[] idxToChar = new char[26];
    private int[] charToIdx = new int[26];
    private boolean[] used = new boolean[26];

    public List<List<Integer>> supersequences(String[] words) {
        Arrays.fill(charToIdx, -1);
        for (String w : words) {
            used[w.charAt(0) - 'a'] = true;
            used[w.charAt(1) - 'a'] = true;
        }
        // Map each used letter to an index [0..m-1]
        for (int c = 0; c < 26; c++) {
            if (used[c]) {
                idxToChar[m] = (char) (c + 'a');
                charToIdx[c] = m++;
            }
        }
        adj = new int[m];
        // Build graph and record forced duplicates
        for (String w : words) {
            int u = charToIdx[w.charAt(0) - 'a'];
            int v = charToIdx[w.charAt(1) - 'a'];
            if (u == v) {
                forcedMask |= (1 << u);
            } else {
                adj[u] |= (1 << v);
            }
        }
        // Try all supersets of forcedMask; keep those that kill all cycles
        int best = 9999;
        List<Integer> goodSets = new ArrayList<>();
        for (int s = 0; s < (1 << m); s++) {
            if ((s & forcedMask) != forcedMask) {
                continue;
            }
            int size = Integer.bitCount(s);
            if (size > best) {
                continue;
            }
            if (!hasCycle(s)) {
                if (size < best) {
                    best = size;
                    goodSets.clear();
                }
                goodSets.add(s);
            }
        }
        // Build distinct freq arrays from these sets
        Set<String> seen = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int s : goodSets) {
            int[] freq = new int[26];
            for (int i = 0; i < m; i++) {
                freq[idxToChar[i] - 'a'] = ((s & (1 << i)) != 0) ? 2 : 1;
            }
            String key = Arrays.toString(freq);
            if (seen.add(key)) {
                List<Integer> tmp = new ArrayList<>();
                for (int f : freq) {
                    tmp.add(f);
                }
                ans.add(tmp);
            }
        }
        return ans;
    }

    private boolean hasCycle(int mask) {
        int[] color = new int[m];
        for (int i = 0; i < m; i++) {
            if (((mask >> i) & 1) == 0 && color[i] == 0) {
                if (dfs(i, color, mask)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int u, int[] color, int mask) {
        color[u] = 1;
        int nxt = adj[u];
        while (nxt != 0) {
            int v = Integer.numberOfTrailingZeros(nxt);
            nxt &= (nxt - 1);
            if (((mask >> v) & 1) == 1) {
                continue;
            }
            if (color[v] == 1) {
                return true;
            }
            if (color[v] == 0 && dfs(v, color, mask)) {
                return true;
            }
        }
        color[u] = 2;
        return false;
    }
}
