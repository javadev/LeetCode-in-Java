**Time Complexity (Big O Time):**

1. The `addNum` method inserts an element into one of the two priority queues (maxHeap or minHeap) and balances the heaps if necessary. The balancing operation has a time complexity of O(log n), where 'n' is the number of elements in the larger heap. Since the elements are inserted one by one, the total time complexity for 'n' insertions is O(n * log n).

2. The `findMedian` method retrieves the median based on the sizes of the two heaps, which takes constant time O(1).

Overall, the time complexity of the program is O(n * log n) for 'n' insertions, where 'n' is the number of elements inserted.

**Space Complexity (Big O Space):**

1. The program uses two priority queues (`maxHeap` and `minHeap`) to store elements. The space complexity is determined by the space required for these priority queues. In the worst case, both heaps can store up to n/2 elements each, where 'n' is the number of elements inserted.

2. Therefore, the space complexity of the program is O(n/2 + n/2) = O(n).

In summary, the provided program has a time complexity of O(n * log n) for 'n' insertions and a space complexity of O(n) due to the storage of elements in two priority queues.
