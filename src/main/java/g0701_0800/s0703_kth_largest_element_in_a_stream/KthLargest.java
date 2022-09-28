package g0701_0800.s0703_kth_largest_element_in_a_stream;

// #Easy #Tree #Binary_Tree #Design #Heap_Priority_Queue #Binary_Search_Tree #Data_Stream
// #2022_03_23_Time_22_ms_(52.43%)_Space_52.7_MB_(31.26%)

import java.util.PriorityQueue;

public class KthLargest {
    private final int maxSize;
    private final PriorityQueue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        this.maxSize = k;
        this.heap = new PriorityQueue<>();
        for (int num : nums) {
            this.add(num);
        }
    }

    public int add(int val) {
        if (heap.size() < maxSize) {
            heap.add(val);
        } else if (heap.peek() < val) {
            heap.add(val);
            heap.poll();
        }
        return heap.peek();
    }
}
