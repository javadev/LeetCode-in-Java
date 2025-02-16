package g3401_3500.s3454_separate_squares_ii;

// #Hard #2025_02_16_Time_246_ms_(100.00%)_Space_79.98_MB_(100.00%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public double separateSquares(int[][] squares) {
        int n = squares.length;
        int m = 2 * n;
        Event[] events = createEvents(squares, m);
        double[] xsRaw = createXsRaw(squares, m);
        Arrays.sort(events, Comparator.comparingDouble(e -> e.y));
        double[] xs = compress(xsRaw);
        double totalUnionArea = calculateTotalUnionArea(events, xs, m);
        double target = totalUnionArea / 2.0;
        return findSplitPoint(events, xs, m, target);
    }

    private Event[] createEvents(int[][] squares, int m) {
        Event[] events = new Event[m];
        int idx = 0;
        for (int[] sq : squares) {
            double x = sq[0];
            double y = sq[1];
            double l = sq[2];
            double x2 = x + l;
            double y2 = y + l;
            events[idx++] = new Event(y, x, x2, 1);
            events[idx++] = new Event(y2, x, x2, -1);
        }
        return events;
    }

    private double[] createXsRaw(int[][] squares, int m) {
        double[] xsRaw = new double[m];
        int xIdx = 0;
        for (int[] sq : squares) {
            double x = sq[0];
            double l = sq[2];
            xsRaw[xIdx++] = x;
            xsRaw[xIdx++] = x + l;
        }
        return xsRaw;
    }

    private double calculateTotalUnionArea(Event[] events, double[] xs, int m) {
        SegmentTree segTree = new SegmentTree(xs);
        double totalUnionArea = 0.0;
        double lastY = events[0].y;
        int i = 0;
        while (i < m) {
            double curY = events[i].y;
            if (curY > lastY) {
                double unionX = segTree.query();
                totalUnionArea += unionX * (curY - lastY);
                lastY = curY;
            }
            while (i < m && events[i].y == curY) {
                int[] indices = findIndices(xs, events[i]);
                segTree.update(1, 0, xs.length - 1, indices[0], indices[1], events[i].type);
                i++;
            }
        }
        return totalUnionArea;
    }

    private double findSplitPoint(Event[] events, double[] xs, int m, double target) {
        SegmentTree segTree = new SegmentTree(xs);
        double lastY = events[0].y;
        double cumArea = 0.0;
        for (int i = 0; i < m; ) {
            double curY = events[i].y;
            if (curY > lastY) {
                double unionX = segTree.query();
                double dy = curY - lastY;
                if (cumArea + unionX * dy >= target - 1e-10) {
                    return lastY + (target - cumArea) / unionX;
                }
                cumArea += unionX * dy;
                lastY = curY;
            }
            while (i < m && events[i].y == curY) {
                int[] indices = findIndices(xs, events[i]);
                segTree.update(1, 0, xs.length - 1, indices[0], indices[1], events[i].type);
                i++;
            }
        }
        return lastY;
    }

    private int[] findIndices(double[] xs, Event event) {
        int lIdx = Arrays.binarySearch(xs, event.x1);
        if (lIdx < 0) {
            lIdx = -lIdx - 1;
        }
        int rIdx = Arrays.binarySearch(xs, event.x2);
        if (rIdx < 0) {
            rIdx = -rIdx - 1;
        }
        return new int[] {lIdx, rIdx};
    }

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

    private static class Event {
        double y;
        double x1;
        double x2;
        int type;

        Event(double y, double x1, double x2, int type) {
            this.y = y;
            this.x1 = x1;
            this.x2 = x2;
            this.type = type;
        }
    }

    private static class SegmentTree {
        int n;
        double[] tree;
        int[] count;
        double[] xs;

        SegmentTree(double[] xs) {
            this.xs = xs;
            this.n = xs.length;
            tree = new double[4 * n];
            count = new int[4 * n];
        }

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

        double query() {
            return tree[1];
        }
    }
}
