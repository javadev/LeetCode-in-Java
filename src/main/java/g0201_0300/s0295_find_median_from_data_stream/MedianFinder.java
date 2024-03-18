package g0201_0300.s0295_find_median_from_data_stream;

// #Hard #Top_100_Liked_Questions #Sorting #Two_Pointers #Design #Heap_Priority_Queue #Data_Stream
// #Big_O_Time_O(n*log_n)_Space_O(n) #2022_07_06_Time_151_ms_(80.24%)_Space_125.2_MB_(44.11%)

import java.util.PriorityQueue;

public class MedianFinder {
    // take two queues one is for storing upper half and the other is for lowerhalf
    // max stores the lower half
    // min heap stores the upper half
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    // initialize your data structure here.
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> (b - a));
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() > num) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }
        if (Math.abs(maxHeap.size() - minHeap.size()) > 1) {
            balance(maxHeap, minHeap);
        }
    }

    public void balance(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        PriorityQueue<Integer> large = maxHeap.size() > minHeap.size() ? maxHeap : minHeap;
        PriorityQueue<Integer> small = maxHeap.size() > minHeap.size() ? minHeap : maxHeap;
        small.offer(large.poll());
    }

    public double findMedian() {
        PriorityQueue<Integer> large = maxHeap.size() > minHeap.size() ? maxHeap : minHeap;
        PriorityQueue<Integer> small = maxHeap.size() > minHeap.size() ? minHeap : maxHeap;
        if (large.size() == small.size()) {
            return (double) (large.peek() + small.peek()) / 2;
        } else {
            return large.peek();
        }
    }
}

/*
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
