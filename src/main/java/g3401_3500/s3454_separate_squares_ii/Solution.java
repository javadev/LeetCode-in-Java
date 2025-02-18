package g3401_3500.s3454_separate_squares_ii;

// #Hard #Array #Binary_Search #Segment_Tree #Line_Sweep
// #2025_02_18_Time_156_ms_(80.18%)_Space_79.96_MB_(64.32%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S1210")
public class Solution {
    private static class Event implements Comparable<Event> {
        double y;
        int x1;
        int x2;
        int type;

        Event(double y, int x1, int x2, int type) {
            this.y = y;
            this.x1 = x1;
            this.x2 = x2;
            this.type = type;
        }

        public int compareTo(Event other) {
            return Double.compare(this.y, other.y);
        }
    }

    private static class Segment {
        double y1;
        double y2;
        double unionX;
        double cumArea;

        Segment(double y1, double y2, double unionX, double cumArea) {
            this.y1 = y1;
            this.y2 = y2;
            this.unionX = unionX;
            this.cumArea = cumArea;
        }
    }

    private static class SegmentTree {
        int[] count;
        double[] len;
        int n;
        int[] x;

        SegmentTree(int[] x) {
            this.x = x;
            n = x.length - 1;
            count = new int[4 * n];
            len = new double[4 * n];
        }

        void update(int idx, int l, int r, int ql, int qr, int val) {
            if (qr < l || ql > r) {
                return;
            }
            if (ql <= l && r <= qr) {
                count[idx] += val;
            } else {
                int mid = (l + r) / 2;
                update(2 * idx + 1, l, mid, ql, qr, val);
                update(2 * idx + 2, mid + 1, r, ql, qr, val);
            }
            if (count[idx] > 0) {
                len[idx] = x[r + 1] - (double) x[l];
            } else {
                if (l == r) {
                    len[idx] = 0;
                } else {
                    len[idx] = len[2 * idx + 1] + len[2 * idx + 2];
                }
            }
        }

        void update(int ql, int qr, int val) {
            update(0, 0, n - 1, ql, qr, val);
        }

        double query() {
            return len[0];
        }
    }

    public double separateSquares(int[][] squares) {
        int n = squares.length;
        Event[] events = new Event[2 * n];
        int idx = 0;
        List<Integer> xList = new ArrayList<>();
        for (int[] s : squares) {
            int x = s[0];
            int y = s[1];
            int l = s[2];
            int x2 = x + l;
            int y2 = y + l;
            events[idx++] = new Event(y, x, x2, 1);
            events[idx++] = new Event(y2, x, x2, -1);
            xList.add(x);
            xList.add(x2);
        }
        Arrays.sort(events);
        int m = xList.size();
        int[] xCords = new int[m];
        for (int i = 0; i < m; i++) {
            xCords[i] = xList.get(i);
        }
        Arrays.sort(xCords);
        int uniqueCount = 0;
        for (int i = 0; i < m; i++) {
            if (i == 0 || xCords[i] != xCords[i - 1]) {
                xCords[uniqueCount++] = xCords[i];
            }
        }
        int[] x = Arrays.copyOf(xCords, uniqueCount);
        SegmentTree segTree = new SegmentTree(x);
        List<Segment> segments = new ArrayList<>();
        double cumArea = 0.0;
        double lastY = events[0].y;
        int iEvent = 0;
        while (iEvent < events.length) {
            double currentY = events[iEvent].y;
            double delta = currentY - lastY;
            if (delta > 0) {
                double unionX = segTree.query();
                segments.add(new Segment(lastY, currentY, unionX, cumArea));
                cumArea += unionX * delta;
            }
            while (iEvent < events.length && events[iEvent].y == currentY) {
                Event e = events[iEvent];
                int left = Arrays.binarySearch(x, e.x1);
                int right = Arrays.binarySearch(x, e.x2);
                if (left < right) {
                    segTree.update(left, right - 1, e.type);
                }
                iEvent++;
            }
            lastY = currentY;
        }
        double totalArea = cumArea;
        double target = totalArea / 2.0;
        double answer;
        for (Segment seg : segments) {
            double segArea = seg.unionX * (seg.y2 - seg.y1);
            if (seg.cumArea + segArea >= target) {
                double needed = target - seg.cumArea;
                answer = seg.y1 + needed / seg.unionX;
                return answer;
            }
        }
        return lastY;
    }
}
