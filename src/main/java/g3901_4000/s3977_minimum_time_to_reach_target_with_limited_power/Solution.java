package g3901_4000.s3977_minimum_time_to_reach_target_with_limited_power;

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue #Shortest_Path #Graph_Theory #Senior_Staff
// #Weekly_Contest_508 #2026_11_03_Time_7_ms_(98.67%)_Space_47.66_MB_(96.00%)

import java.util.Arrays;

public class Solution {
    private static class Graph {
        int[] head;
        int[] next;
        int[] to;
        int[] time;

        Graph(int n, int[][] edges) {
            int m = edges.length;

            head = new int[n];
            next = new int[m + 1];
            to = new int[m + 1];
            time = new int[m + 1];

            for (int i = 0; i < m; i++) {
                int u = edges[i][0];

                to[i + 1] = edges[i][1];
                time[i + 1] = edges[i][2];
                next[i + 1] = head[u];
                head[u] = i + 1;
            }
        }
    }

    private static class MinHeap {
        long[] heap = new long[2048];
        int size;

        void push(long value) {
            if (++size == heap.length) {
                heap = Arrays.copyOf(heap, heap.length << 1);
            }

            int j = size;

            while (j > 1) {
                int p = j >>> 1;

                if (heap[p] <= value) {
                    break;
                }

                heap[j] = heap[p];
                j = p;
            }

            heap[j] = value;
        }

        long pop() {
            long result = heap[1];
            long val = heap[size--];

            int i = 1;

            while ((i << 1) <= size) {
                int left = i << 1;
                int right = left + 1;

                int min = right <= size && heap[right] < heap[left] ? right : left;

                if (val <= heap[min]) {
                    break;
                }

                heap[i] = heap[min];
                i = min;
            }

            if (size > 0) {
                heap[i] = val;
            }

            return result;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public long[] minTimeMaxPower(
            int n, int[][] edges, int power, int[] cost, int source, int target) {
        Graph graph = new Graph(n, edges);
        int[] bestPower = new int[n];
        Arrays.fill(bestPower, -1);
        MinHeap pq = new MinHeap();
        long startPowerComp = 1024L - power;
        pq.push((startPowerComp << 11) | source);
        while (!pq.isEmpty()) {
            long curr = pq.pop();
            long currTime = curr >>> 22;
            int currPower = 1024 - (int) ((curr >>> 11) & 0x7FF);
            int u = (int) (curr & 0x7FF);
            if (u == target) {
                return new long[] {currTime, currPower};
            }
            if (currPower > bestPower[u]) {
                bestPower[u] = currPower;
                if (currPower >= cost[u]) {
                    addNeighbors(pq, currTime, currPower, u, graph, cost);
                }
            }
        }
        return new long[] {-1, -1};
    }

    private void addNeighbors(
            MinHeap pq, long currTime, int currPower, int u, Graph graph, int[] cost) {
        int nextPower = currPower - cost[u];
        long nextPowerComp = 1024L - nextPower;
        for (int e = graph.head[u]; e != 0; e = graph.next[e]) {
            long nextPacked =
                    ((currTime + graph.time[e]) << 22) | (nextPowerComp << 11) | graph.to[e];

            pq.push(nextPacked);
        }
    }
}
