package g1701_1800.s1722_minimize_hamming_distance_after_swap_operations;

// #Medium #Array #Depth_First_Search #Union_Find
// #2022_04_25_Time_51_ms_(94.82%)_Space_77.5_MB_(96.89%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int i, N = source.length, weight = 0;
        int[] parent = new int[N];
        for (i = 0; i < N; i++) {
            parent[i] = i;
        }

        for (int[] swap : allowedSwaps) {
            union(swap[0], swap[1], parent);
        }

        HashMap<Integer, List<Integer>> components = new HashMap<>();
        for (i = 0; i < N; i++) {
            find(i, parent);
            List<Integer> list = components.getOrDefault(parent[i], new ArrayList<>());
            list.add(i);
            components.put(parent[i], list);
        }

        for (Integer key : components.keySet()) {
            weight += getHammingDistance(source, target, components.get(key));
        }

        return weight;
    }

    private int getHammingDistance(int[] source, int[] target, List<Integer> indices) {
        HashMap<Integer, Integer> list1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> list2 = new HashMap<Integer, Integer>();

        for (int i : indices) {
            list1.put(target[i], 1 + list1.getOrDefault(target[i], 0));
            list2.put(source[i], 1 + list2.getOrDefault(source[i], 0));
        }

        int size = indices.size();

        for (int key : list1.keySet()) {
            size -= Math.min(list1.get(key), list2.getOrDefault(key, 0));
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
