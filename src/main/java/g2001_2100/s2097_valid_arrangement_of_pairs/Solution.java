package g2001_2100.s2097_valid_arrangement_of_pairs;

// #Hard #Depth_First_Search #Graph #Eulerian_Circuit
// #2022_05_25_Time_158_ms_(100.00%)_Space_122.1_MB_(92.55%)

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution {
    public int[][] validArrangement(int[][] pairs) {
        HashMap<Integer, int[]> inOutedge = new HashMap<>();
        HashMap<Integer, Queue<Integer>> adList = getAdList(pairs, inOutedge);
        int start = getStart(inOutedge);
        int[][] res = new int[pairs.length][2];
        getRes(start, adList, res, pairs.length - 1);
        return res;
    }

    private HashMap<Integer, Queue<Integer>> getAdList(
            int[][] pairs, HashMap<Integer, int[]> inOutEdge) {
        HashMap<Integer, Queue<Integer>> adList = new HashMap<>();
        for (int[] pair : pairs) {
            int s = pair[0];
            int d = pair[1];
            Queue<Integer> set = adList.computeIfAbsent(s, k -> new LinkedList<>());
            set.add(d);
            int[] sEdgeCnt = inOutEdge.computeIfAbsent(s, k -> new int[2]);
            int[] dEdgeCnt = inOutEdge.computeIfAbsent(d, k -> new int[2]);
            sEdgeCnt[1]++;
            dEdgeCnt[0]++;
        }
        return adList;
    }

    private int getRes(int k, HashMap<Integer, Queue<Integer>> adList, int[][] res, int idx) {
        Queue<Integer> edges = adList.get(k);
        if (edges == null) {
            return idx;
        }
        while (!edges.isEmpty()) {
            int edge = edges.poll();
            idx = getRes(edge, adList, res, idx);
            res[idx--] = new int[] {k, edge};
        }
        return idx;
    }

    private int getStart(HashMap<Integer, int[]> map) {
        int start = -1;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int k = entry.getKey();
            int inEdge = entry.getValue()[0];
            int outEdge = entry.getValue()[1];
            start = k;
            if (outEdge - inEdge == 1) {
                return k;
            }
        }
        return start;
    }
}
