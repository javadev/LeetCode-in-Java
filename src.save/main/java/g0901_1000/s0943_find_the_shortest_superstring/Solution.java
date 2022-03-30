package g0901_1000.s0943_find_the_shortest_superstring;

// #Hard #Array #String #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2022_03_30_Time_16_ms_(100.00%)_Space_42.3_MB_(95.24%)

import java.util.Arrays;

public class Solution {
    private int n = -1;
    private int k = -1;
    private int max = 0;
    private int[] maxOrder;
    private int[] remap = null;
    private int[][] lcsps = null;

    public String shortestSuperstring(String[] words) {
        this.n = words.length;
        this.lcsps = new int[n][n];
        int[] maxcp = new int[n];
        int[] maxcs = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    lcsps[i][j] = lcsp(words[i], words[j]);
                    maxcp[j] = Math.max(maxcp[j], lcsps[i][j]);
                    maxcs[i] = Math.max(maxcs[i], lcsps[i][j]);
                }
            }
        }

        this.max = 0;
        this.maxOrder = new int[n];
        this.remap = new int[n];
        this.k = 0;
        int i = n - 1;
        int j = 0;
        while (i > -1) {
            if (maxcp[i] == 0 && maxcs[i] == 0) {
                maxOrder[n - 1 - k++] = i;
            } else {
                remap[j++] = i;
            }
            i--;
        }
        if (k < n) {
            dpts();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(words[maxOrder[0]]);
        for (i = 1; i < n; i++) {
            sb.append(words[maxOrder[i]].substring(lcsps[maxOrder[i - 1]][maxOrder[i]]));
        }
        return sb.toString();
    }

    private void dpts() {
        int ndp = n - k;
        int[][] memo = new int[ndp][1 << ndp];
        int[][] next = new int[ndp][1 << ndp];
        for (int i = 0; i < ndp; i++) {
            Arrays.fill(memo[i], -1);
        }
        max = 0;
        int first = 0;
        int mask = (1 << ndp) - 1;
        for (int i = 0; i < ndp; i++) {
            int score = dpts(i, mask ^ (1 << i), memo, next);
            if (score > max) {
                max = score;
                first = i;
            }
        }
        maxOrder[0] = remap[first];
        int i = 1;
        int j = first;
        int m = mask ^ (1 << first);
        while (i < ndp) {
            j = next[j][m];
            maxOrder[i] = remap[j];
            m ^= (1 << j);
            i++;
        }
    }

    private int dpts(int i, int mask, int[][] memo, int[][] next) {
        if (mask == 0) {
            return 0;
        }
        int maxMemo = memo[i][mask];
        int maxj = -1;
        if (maxMemo != -1) {
            return maxMemo;
        }
        int m = mask;
        while (m != 0) {
            int j = Integer.numberOfTrailingZeros(m);
            int score = lcsps[remap[i]][remap[j]] + dpts(j, mask ^ (1 << j), memo, next);
            if (score > maxMemo) {
                maxMemo = score;
                maxj = j;
            }
            m ^= 1 << j;
        }
        next[i][mask] = maxj;
        memo[i][mask] = maxMemo;
        return memo[i][mask];
    }

    private int lcsp(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        for (int i = Math.max(1, n1 - n2 + 1); i < n1; i++) {
            if (s1.endsWith(s2.substring(0, n1 - i))) {
                return n1 - i;
            }
        }
        return 0;
    }
}
