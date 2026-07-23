package g3801_3900.s3845_maximum_subarray_xor_with_bounded_range;

// #Hard #Array #Bit_Manipulation #Prefix_Sum #Sliding_Window #Trie #Queue #Monotonic_Queue
// #Senior_Staff #Weekly_Contest_489 #2026_07_22_Time_130_ms_(98.70%)_Space_64.50_MB_(96.10%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    private static final int BITS = 15;

    static class TrieNode {
        TrieNode[] next = new TrieNode[2];
        int count = 0;
    }

    private void insert(TrieNode root, int num) {
        TrieNode node = root;
        for (int i = BITS - 1; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.next[bit] == null) {
                node.next[bit] = new TrieNode();
            }
            node = node.next[bit];
            node.count++;
        }
    }

    private void remove(TrieNode root, int num) {
        TrieNode node = root;
        for (int i = BITS - 1; i >= 0; i--) {
            int bit = (num >> i) & 1;
            TrieNode child = node.next[bit];
            child.count--;
            if (child.count == 0) {
                node.next[bit] = null;
            }
            node = child;
        }
    }

    private int query(TrieNode root, int num) {
        TrieNode node = root;
        int res = 0;
        for (int i = BITS - 1; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.next[bit ^ 1] != null) {
                res |= (1 << i);
                node = node.next[bit ^ 1];
            } else {
                node = node.next[bit];
            }
        }
        return res;
    }

    public int maxXor(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ nums[i];
        }
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        TrieNode root = new TrieNode();
        int maxXor = 0;
        int l = 0;
        insert(root, 0);
        for (int r = 0; r < n; r++) {
            // maintain max deque
            while (!maxDeque.isEmpty() && nums[r] > nums[maxDeque.peekLast()]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(r);
            // maintain min deque
            while (!minDeque.isEmpty() && nums[r] < nums[minDeque.peekLast()]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(r);
            // shrink window if max-min > k
            while (!maxDeque.isEmpty()
                    && !minDeque.isEmpty()
                    && nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > k) {
                remove(root, prefix[l]);
                l++;
                if (maxDeque.peekFirst() < l) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() < l) {
                    minDeque.pollFirst();
                }
            }
            // query and insert prefix[r+1]
            maxXor = Math.max(maxXor, query(root, prefix[r + 1]));
            insert(root, prefix[r + 1]);
        }
        return maxXor;
    }
}
