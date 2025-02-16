package g3401_3500.s3454_separate_squares_ii;

// #Hard #2025_02_16_Time_243_ms_(100.00%)_Space_76.06_MB_(100.00%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public double separateSquares(int[][] squares) {
        int n = squares.length;
        int m = 2 * n;
        Event[] events = new Event[m];
        double[] xsRaw = new double[m];
        int idx = 0;
        int xIdx = 0;
        for (int[] sq : squares) {
            // Each square gives a rectangle [x, x+l] x [y, y+l]
            double x = sq[0];
            double y = sq[1];
            double l = sq[2];
            double x2 = x + l;
            double y2 = y + l;
            events[idx++] = new Event(y, x, x2, 1);
            events[idx++] = new Event(y2, x, x2, -1);
            xsRaw[xIdx++] = x;
            xsRaw[xIdx++] = x2;
        }
        // Sort events by their y-coordinate (they are exact integers in double format)
        Arrays.sort(events, Comparator.comparingDouble(e -> e.y));
        // Compress x-coordinates
        double[] xs = compress(xsRaw);
        // FIRST SWEEP: compute total union area.
        SegmentTree segTree = new SegmentTree(xs);
        double totalUnionArea = 0.0;
        double lastY = events[0].y;
        for (int i = 0; i < m; ) {
            double curY = events[i].y;
            if (curY > lastY) {
                double unionX = segTree.query();
                totalUnionArea += unionX * (curY - lastY);
                lastY = curY;
            }
            // Process all events at y == curY
            while (i < m && events[i].y == curY) {
                int lIdx = Arrays.binarySearch(xs, events[i].x1);
                if (lIdx < 0) {
                    lIdx = -lIdx - 1;
                }
                int rIdx = Arrays.binarySearch(xs, events[i].x2);
                if (rIdx < 0) {
                    rIdx = -rIdx - 1;
                }
                segTree.update(1, 0, xs.length - 1, lIdx, rIdx, events[i].type);
                i++;
            }
        }
        double target = totalUnionArea / 2.0;
        // SECOND SWEEP: find minimal y such that cumulative union area reaches target.
        // Reinitialize segment tree for a fresh sweep.
        segTree = new SegmentTree(xs);
        lastY = events[0].y;
        double cumArea = 0.0;
        for (int i = 0; i < m; ) {
            double curY = events[i].y;
            if (curY > lastY) {
                double unionX = segTree.query();
                double dy = curY - lastY;
                if (cumArea + unionX * dy >= target - 1e-10) {
                    // The answer lies in this interval.
                    return lastY + (target - cumArea) / unionX;
                }
                cumArea += unionX * dy;
                lastY = curY;
            }
            while (i < m && events[i].y == curY) {
                int lIdx = Arrays.binarySearch(xs, events[i].x1);
                if (lIdx < 0) {
                    lIdx = -lIdx - 1;
                }
                int rIdx = Arrays.binarySearch(xs, events[i].x2);
                if (rIdx < 0) {
                    rIdx = -rIdx - 1;
                }
                segTree.update(1, 0, xs.length - 1, lIdx, rIdx, events[i].type);
                i++;
            }
        }
        return lastY;
    }

    // Compress an array of doubles into a sorted array of unique values.
    private double[] compress(double[] arr) {
        Arrays.sort(arr);
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                cnt++;
            }
        }
        double[] res = new double[cnt];
        res[0] = arr[0];
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                res[j++] = arr[i];
            }
        }
        return res;
    }

    // Event class for the sweep-line.
    private static class Event {
        double y;
        double x1;
        double x2;
        // +1 for adding an interval; -1 for removing.
        int type;

        Event(double y, double x1, double x2, int type) {
            this.y = y;
            this.x1 = x1;
            this.x2 = x2;
            this.type = type;
        }
    }

    // Segment Tree for maintaining the union length over the x-axis.
    private static class SegmentTree {
        int n;
        // Covered length of the segment.
        double[] tree;
        // Coverage count for the segment.
        int[] count;
        // The compressed x-coordinates.
        double[] xs;

        SegmentTree(double[] xs) {
            this.xs = xs;
            this.n = xs.length;
            // Allocate 4*n size arrays.
            tree = new double[4 * n];
            count = new int[4 * n];
        }

        // Update the range [ql, qr) with value 'val'.
        // The current node covers indices [l, r) in xs.
        void update(int idx, int l, int r, int ql, int qr, int val) {
            if (qr <= l || ql >= r) {
                return;
            }
            if (ql <= l && r <= qr) {
                count[idx] += val;
            } else {
                int mid = (l + r) >> 1;
                update(idx << 1, l, mid, ql, qr, val);
                update(idx << 1 | 1, mid, r, ql, qr, val);
            }
            if (count[idx] > 0) {
                tree[idx] = xs[r] - xs[l];
            } else if (r - l == 1) {
                tree[idx] = 0;
            } else {
                tree[idx] = tree[idx << 1] + tree[idx << 1 | 1];
            }
        }

        // Query the current total union length.
        double query() {
            return tree[1];
        }
    }
}
