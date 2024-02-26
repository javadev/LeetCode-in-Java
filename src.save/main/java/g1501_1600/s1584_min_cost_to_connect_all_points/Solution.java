package g1501_1600.s1584_min_cost_to_connect_all_points;

// #Medium #Array #Union_Find #Minimum_Spanning_Tree
// #2022_04_11_Time_134_ms_(87.37%)_Space_50.1_MB_(95.72%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int minCostConnectPoints(int[][] points) {
        int v = points.length;
        if (v == 2) {
            return getDistance(points[0], points[1]);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(v, new Pair());
        boolean[] mst = new boolean[v];
        int[] dist = new int[v];
        int[] parent = new int[v];
        Arrays.fill(dist, 1000000);
        Arrays.fill(parent, -1);
        dist[0] = 0;
        parent[0] = 0;
        for (int i = 0; i < v; i++) {
            pq.add(new Pair(dist[i], i));
        }
        constructMST(parent, points, mst, pq, dist);
        int cost = 0;
        for (int i = 1; i < parent.length; i++) {
            cost += getDistance(points[parent[i]], points[i]);
        }
        return cost;
    }

    public void constructMST(
            int[] parent, int[][] points, boolean[] mst, PriorityQueue<Pair> pq, int[] dist) {
        if (!containsFalse(mst)) {
            return;
        }
        Pair newPair = pq.poll();
        int pointIndex = newPair.getV();
        mst[pointIndex] = true;
        for (int i = 0; i < parent.length; i++) {
            int d = getDistance(points[pointIndex], points[i]);
            if (!mst[i] && d < dist[i]) {
                dist[i] = d;
                pq.add(new Pair(dist[i], i));
                parent[i] = pointIndex;
            }
        }
        constructMST(parent, points, mst, pq, dist);
    }

    public boolean containsFalse(boolean[] mst) {
        for (boolean b : mst) {
            if (!b) {
                return true;
            }
        }
        return false;
    }

    public int getDistance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    private static class Pair implements Comparator<Pair> {
        int dis;
        int v;

        public Pair() {}

        public Pair(int dis, int v) {
            this.dis = dis;
            this.v = v;
        }

        public int getDis() {
            return dis;
        }

        public int getV() {
            return v;
        }

        @Override
        public int compare(Pair p1, Pair p2) {
            return p1.dis - p2.dis;
        }
    }
}
