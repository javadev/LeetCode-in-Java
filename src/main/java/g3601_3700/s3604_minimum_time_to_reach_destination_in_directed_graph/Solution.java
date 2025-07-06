package g3601_3700.s3604_minimum_time_to_reach_destination_in_directed_graph;

// #Medium #2025_07_06_Time_5_ms_(100.00%)_Space_102.51_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    private static final int INF = Integer.MAX_VALUE;

    public int minTime(int n, int[][] edges) {
        int[] head = new int[n];
        int[] to = new int[edges.length];
        int[] start = new int[edges.length];
        int[] end = new int[edges.length];
        int[] next = new int[edges.length];
        Arrays.fill(head, -1);
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            to[i] = edges[i][1];
            start[i] = edges[i][2];
            end[i] = edges[i][3];
            next[i] = head[u];
            head[u] = i;
        }
        int[] heap = new int[n];
        int[] time = new int[n];
        int[] pos = new int[n];
        boolean[] visited = new boolean[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            time[i] = INF;
            pos[i] = -1;
        }
        time[0] = 0;
        heap[size] = 0;
        pos[0] = 0;
        size++;
        while (size > 0) {
            int u = heap[0];
            heap[0] = heap[--size];
            pos[heap[0]] = 0;
            heapifyDown(heap, time, pos, size, 0);
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            if (u == n - 1) {
                return time[u];
            }
            for (int e = head[u]; e != -1; e = next[e]) {
                int v = to[e];
                int t0 = time[u];
                if (t0 > end[e]) {
                    continue;
                }
                int arrival = Math.max(t0, start[e]) + 1;
                if (arrival < time[v]) {
                    time[v] = arrival;
                    if (pos[v] == -1) {
                        heap[size] = v;
                        pos[v] = size;
                        heapifyUp(heap, time, pos, size);
                        size++;
                    } else {
                        heapifyUp(heap, time, pos, pos[v]);
                    }
                }
            }
        }
        return -1;
    }

    private void heapifyUp(int[] heap, int[] time, int[] pos, int i) {
        while (i > 0) {
            int p = (i - 1) / 2;
            if (time[heap[p]] <= time[heap[i]]) {
                break;
            }
            swap(heap, pos, i, p);
            i = p;
        }
    }

    private void heapifyDown(int[] heap, int[] time, int[] pos, int size, int i) {
        while (2 * i + 1 < size) {
            int j = 2 * i + 1;
            if (j + 1 < size && time[heap[j + 1]] < time[heap[j]]) {
                j++;
            }
            if (time[heap[i]] <= time[heap[j]]) {
                break;
            }
            swap(heap, pos, i, j);
            i = j;
        }
    }

    private void swap(int[] heap, int[] pos, int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
        pos[heap[i]] = i;
        pos[heap[j]] = j;
    }
}
