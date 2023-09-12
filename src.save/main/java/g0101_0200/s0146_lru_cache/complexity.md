**Time Complexity (Big O Time):**

1. `get(int key)` Method:
   - Accessing an element from the `cacheMap` is done in constant time (O(1)).
   - Moving a node to the head in the `moveToHead` method also operates in constant time (O(1)).
   - Overall, the `get` method's time complexity is O(1).

2. `put(int key, int value)` Method:
   - Updating the value of an existing key in the `cacheMap` is done in constant time (O(1)).
   - Adding a new node to the cache is done in constant time if the cache is not full (O(1)).
   - If the cache is full, it removes the node at the tail, which is also done in constant time (O(1)).
   - Recursively calling the `put` method when the cache is full does not result in nested loops because the eviction operation happens once in each recursion.
   - Overall, the `put` method's time complexity is O(1) on average, but in the worst case (when eviction happens multiple times), it can be considered O(N), where N is the capacity of the cache.

3. `moveToHead(LruCacheNode node)` Method:
   - Moving a node to the head of the cache is done in constant time (O(1)) because it involves changing pointers.
   - The time complexity of this method is O(1).

Overall, the time complexity of most operations in the LRU cache is O(1), except for the `put` method in the worst-case scenario.

**Space Complexity (Big O Space):**

The space complexity of this LRU cache implementation is O(capacity), where "capacity" represents the maximum number of key-value pairs the cache can store. The primary space usage comes from the `cacheMap`, which stores the key-value pairs, and the linked list of nodes (`head` and `tail`) used to maintain the order of access. Additionally, each node in the linked list consumes space proportional to the key and value sizes.

In summary, the space complexity of the LRU cache is determined by its capacity, and the primary space-consuming data structure is the `cacheMap`, resulting in an overall space complexity of O(capacity).
