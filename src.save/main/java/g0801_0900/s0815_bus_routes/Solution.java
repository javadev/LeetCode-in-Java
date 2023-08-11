package g0801_0900.s0815_bus_routes;

// #Hard #Array #Hash_Table #Breadth_First_Search #Level_2_Day_11_Graph/BFS/DFS
// #2022_03_23_Time_49_ms_(89.11%)_Space_60.6_MB_(87.28%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

@SuppressWarnings("unchecked")
public class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        Set<Integer> targetRoutes = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] taken = new boolean[routes.length];
        List<Integer>[] graph = buildGraph(routes, source, target, queue, targetRoutes, taken);
        if (targetRoutes.isEmpty()) {
            return -1;
        }
        int bus = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int route = queue.poll();
                if (targetRoutes.contains(route)) {
                    return bus;
                }
                for (int nextRoute : graph[route]) {
                    if (!taken[nextRoute]) {
                        queue.offer(nextRoute);
                        taken[nextRoute] = true;
                    }
                }
            }
            bus++;
        }
        return -1;
    }

    private List<Integer>[] buildGraph(
            int[][] routes,
            int source,
            int target,
            Queue<Integer> queue,
            Set<Integer> targetRoutes,
            boolean[] taken) {
        int len = routes.length;
        ArrayList[] graph = new ArrayList[len];
        for (int i = 0; i < len; i++) {
            Arrays.sort(routes[i]);
            graph[i] = new ArrayList<Integer>();
            int id = Arrays.binarySearch(routes[i], source);
            if (id >= 0) {
                queue.offer(i);
                taken[i] = true;
            }
            id = Arrays.binarySearch(routes[i], target);
            if (id >= 0) {
                targetRoutes.add(i);
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (commonStop(routes[i], routes[j])) {
                    graph[i].add(j);
                    graph[j].add(i);
                }
            }
        }
        return graph;
    }

    private boolean commonStop(int[] routeA, int[] routeB) {
        int idA = 0;
        int idB = 0;
        while (idA < routeA.length && idB < routeB.length) {
            if (routeA[idA] == routeB[idB]) {
                return true;
            } else if (routeA[idA] < routeB[idB]) {
                idA++;
            } else {
                idB++;
            }
        }
        return false;
    }
}
