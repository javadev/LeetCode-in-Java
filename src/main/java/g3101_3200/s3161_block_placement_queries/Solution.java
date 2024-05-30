package g3101_3200.s3161_block_placement_queries;

// #Hard #Array #Binary_Search #Segment_Tree #Binary_Indexed_Tree
// #2024_05_30_Time_137_ms_(99.38%)_Space_143.7_MB_(54.52%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static class Seg {
        private final int start;
        private final int end;
        private int min;
        private int max;
        private int len;
        private boolean obstacle;
        private Seg left;
        private Seg right;

        public static Seg init(int n) {
            return new Seg(0, n);
        }

        private Seg(int start, int end) {
            this.start = start;
            this.end = end;
            if (start >= end) {
                return;
            }
            int mid = start + ((end - start) >> 1);
            left = new Seg(start, mid);
            right = new Seg(mid + 1, end);
            refresh();
        }

        public void set(int i) {
            if (i < start || i > end) {
                return;
            } else if (i == start && i == end) {
                obstacle = true;
                min = max = start;
                return;
            }
            left.set(i);
            right.set(i);
            refresh();
        }

        private void refresh() {
            if (left.obstacle) {
                min = left.min;
                if (right.obstacle) {
                    max = right.max;
                    len = Math.max(right.min - left.max, Math.max(left.len, right.len));
                } else {
                    max = left.max;
                    len = Math.max(left.len, right.end - left.max);
                }
                obstacle = true;
            } else if (right.obstacle) {
                min = right.min;
                max = right.max;
                len = Math.max(right.len, right.min - left.start);
                obstacle = true;
            } else {
                len = end - start;
            }
        }

        public void max(int n, int[] t) {
            if (start > n) {
                return;
            } else if (end <= n) {
                t[0] = Math.max(t[0], len);
                if (obstacle) {
                    t[1] = max;
                }
                return;
            }
            left.max(n, t);
            if (!right.obstacle || right.min >= n) {
                return;
            }
            t[0] = Math.max(t[0], right.min - t[1]);
            right.max(n, t);
        }
    }

    public List<Boolean> getResults(int[][] queries) {
        int max = 0;
        for (int[] i : queries) {
            max = Math.max(max, i[1]);
        }
        Seg root = Seg.init(max);
        root.set(0);

        List<Boolean> res = new ArrayList<>(queries.length);
        for (int[] i : queries) {
            if (i[0] == 1) {
                root.set(i[1]);
            } else {
                int[] t = new int[2];
                root.max(i[1], t);
                res.add(Math.max(t[0], i[1] - t[1]) >= i[2]);
            }
        }
        return res;
    }
}
