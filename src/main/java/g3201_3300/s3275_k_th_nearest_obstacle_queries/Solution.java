package g3201_3300.s3275_k_th_nearest_obstacle_queries;

// #Medium #Array #Heap_Priority_Queue #2024_09_04_Time_33_ms_(100.00%)_Space_162_MB_(37.19%)

public class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        final int len = queries.length;
        int[] results = new int[len];
        int[] heap = new int[k];
        for (int i = 0; i < k && i < len; i++) {
            int[] query = queries[i];
            heap[i] = Math.abs(query[0]) + Math.abs(query[1]);
            results[i] = -1;
        }
        if (k <= len) {
            buildMaxHeap(heap, k);
            results[k - 1] = heap[0];
        }
        for (int i = k; i < len; i++) {
            int[] query = queries[i];
            int dist = Math.abs(query[0]) + Math.abs(query[1]);
            if (dist < heap[0]) {
                heap[0] = dist;
                heapify(heap, 0, k);
            }
            results[i] = heap[0];
        }
        return results;
    }

    private void buildMaxHeap(int[] heap, int size) {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(heap, i, size);
        }
    }

    private void heapify(int[] heap, int index, int size) {
        int root = heap[index];
        final int left = 2 * index + 1;
        final int right = 2 * index + 2;
        if (right < size && root < heap[right] && heap[left] < heap[right]) {
            heap[index] = heap[right];
            heap[right] = root;
            heapify(heap, right, size);
        } else if (left < size && root < heap[left]) {
            heap[index] = heap[left];
            heap[left] = root;
            heapify(heap, left, size);
        }
    }
}
