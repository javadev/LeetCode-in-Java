package g1701_1800.s1722_minimize_hamming_distance_after_swap_operations;

// #Medium #Array #Depth_First_Search #Union_Find
// #2022_04_25_Time_51_ms_(94.82%)_Space_77.5_MB_(96.89%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int i;
        int n = source.length;
        int weight = 0;
        int[] parent = new int[n];
        for (i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] swap : allowedSwaps) {
            union(swap[0], swap[1], parent);
        }
        HashMap<Integer, List<Integer>> components = new HashMap<>();
        for (i = 0; i < n; i++) {
            find(i, parent);
            List<Integer> list = components.getOrDefault(parent[i], new ArrayList<>());
            list.add(i);
            components.put(parent[i], list);
        }
        for (Map.Entry<Integer, List<Integer>> entry : components.entrySet()) {
            weight += getHammingDistance(source, target, entry.getValue());
        }
        return weight;
    }

    private int getHammingDistance(int[] source, int[] target, List<Integer> indices) {
        HashMap<Integer, Integer> list1 = new HashMap<>();
        HashMap<Integer, Integer> list2 = new HashMap<>();
        for (int i : indices) {
            list1.put(target[i], 1 + list1.getOrDefault(target[i], 0));
            list2.put(source[i], 1 + list2.getOrDefault(source[i], 0));
        }
        int size = indices.size();
        for (Map.Entry<Integer, Integer> entry : list1.entrySet()) {
            size -= Math.min(entry.getValue(), list2.getOrDefault(entry.getKey(), 0));
        }
        return size;
    }

    private void union(int x, int y, int[] parent) {
        if (x != y) {
            int a = find(x, parent);
            int b = find(y, parent);
            if (a != b) {
                parent[a] = b;
            }
        }
    }

    private int find(int x, int[] parent) {
        int y = x;
        while (y != parent[y]) {
            y = parent[y];
        }
        parent[x] = y;
        return y;
    }
}
