package g3501_3600.s3547_maximum_sum_of_edge_values_in_a_graph;

// #Hard #2025_05_11_Time_27_ms_(98.41%)_Space_63.02_MB_(98.41%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    private int[] p;
    private boolean[] c;
    private int[] s;

    public long maxScore(int n, int[][] edges) {
        p = new int[n];
        c = new boolean[n];
        s = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
            s[i] = 1;
        }
        for (int[] ele : edges) {
            join(ele[0], ele[1]);
        }
        List<Integer> circles = new ArrayList<>();
        List<Integer> chains = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            p[i] = findParent(i);
            if (c[i]) {
                c[p[i]] = true;
            }
        }
        for (int i = 0; i < p.length; i++) {
            if (p[i] == i) {
                int size = s[i];
                if (c[i]) {
                    circles.add(size);
                } else {
                    chains.add(size);
                }
            }
        }
        Collections.sort(circles);
        chains.sort((a, b) -> Integer.compare(b, a));
        long ret = 0;
        int start = n;
        for (int size : circles) {
            if (size == 1) {
                continue;
            }
            int[] temp = new int[size];
            int ptr1 = 0;
            int ptr2 = size - 1;
            int curStart = start - size + 1;
            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    temp[ptr1++] = curStart + i;
                } else {
                    temp[ptr2--] = curStart + i;
                }
            }
            long pro = 0;
            for (int i = 1; i < size; i++) {
                pro += (long) temp[i] * temp[i - 1];
            }
            pro += (long) temp[0] * temp[size - 1];
            ret += pro;
            start = start - size;
        }
        for (int size : chains) {
            if (size == 1) {
                continue;
            }
            int[] temp = new int[size];
            int ptr1 = 0;
            int ptr2 = size - 1;
            int curStart = start - size + 1;
            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    temp[ptr1++] = curStart + i;
                } else {
                    temp[ptr2--] = curStart + i;
                }
            }
            long pro = 0;
            for (int i = 1; i < size; i++) {
                pro += (long) temp[i] * temp[i - 1];
            }
            ret += pro;
            start = start - size;
        }
        return ret;
    }

    private int findParent(int x) {
        if (p[x] != x) {
            p[x] = findParent(p[x]);
        }
        return p[x];
    }

    private void join(int a, int b) {
        int bp = findParent(a);
        int ap = findParent(b);
        if (bp == ap) {
            c[bp] = true;
            return;
        }
        int s1 = s[ap];
        int s2 = s[bp];
        if (s1 > s2) {
            p[bp] = ap;
            s[ap] += s[bp];
        } else {
            p[ap] = bp;
            s[bp] += s[ap];
        }
    }
}
