package g3501_3600.s3569_maximize_count_of_distinct_primes_after_split;

// #Hard #Array #Math #Segment_Tree #Number_Theory
// #2025_06_03_Time_280_ms_(97.30%)_Space_76.62_MB_(52.25%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

@SuppressWarnings("java:S6541")
public class Solution {
    private static final int MAX_VAL = 100005;
    private static boolean[] isPrime = new boolean[MAX_VAL];

    static {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i < MAX_VAL; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX_VAL; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    private static class Node {
        int maxVal;
        int lazyDelta;
    }

    private static class SegmentTree {
        Node[] tree;
        int n;

        public SegmentTree(int n) {
            this.n = n;
            tree = new Node[4 * this.n];
            for (int i = 0; i < 4 * this.n; i++) {
                tree[i] = new Node();
            }
        }

        private void push(int nodeIdx) {
            if (tree[nodeIdx].lazyDelta != 0) {
                tree[2 * nodeIdx].maxVal += tree[nodeIdx].lazyDelta;
                tree[2 * nodeIdx].lazyDelta += tree[nodeIdx].lazyDelta;
                tree[2 * nodeIdx + 1].maxVal += tree[nodeIdx].lazyDelta;
                tree[2 * nodeIdx + 1].lazyDelta += tree[nodeIdx].lazyDelta;
                tree[nodeIdx].lazyDelta = 0;
            }
        }

        private void update(int queryStart, int queryEnd, int delta) {
            queryStart = Math.max(1, queryStart);
            queryEnd = Math.min(n - 1, queryEnd);
            if (queryStart > queryEnd) {
                return;
            }
            update(1, 1, n - 1, queryStart, queryEnd, delta);
        }

        private void update(
                int nodeIdx, int start, int end, int queryStart, int queryEnd, int delta) {
            if (start > end || start > queryEnd || end < queryStart) {
                return;
            }
            if (queryStart <= start && end <= queryEnd) {
                tree[nodeIdx].maxVal += delta;
                tree[nodeIdx].lazyDelta += delta;
                return;
            }
            push(nodeIdx);

            int mid = (start + end) / 2;
            update(2 * nodeIdx, start, mid, queryStart, queryEnd, delta);
            update(2 * nodeIdx + 1, mid + 1, end, queryStart, queryEnd, delta);
            tree[nodeIdx].maxVal = Math.max(tree[2 * nodeIdx].maxVal, tree[2 * nodeIdx + 1].maxVal);
        }

        public int queryMax() {
            if (n - 1 < 1) {
                return 0;
            }
            return tree[1].maxVal;
        }
    }

    public int[] maximumCount(int[] nums, int[][] queries) {
        int n = nums.length;
        Map<Integer, TreeSet<Integer>> primeIndices = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (isPrime[nums[i]]) {
                primeIndices.computeIfAbsent(nums[i], k -> new TreeSet<>()).add(i);
            }
        }
        SegmentTree segmentTree = new SegmentTree(n);
        for (Map.Entry<Integer, TreeSet<Integer>> entry : primeIndices.entrySet()) {
            TreeSet<Integer> indices = entry.getValue();
            int first = indices.first();
            int last = indices.last();
            segmentTree.update(first + 1, last, 1);
        }
        int[] result = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int idx = queries[q][0];
            int val = queries[q][1];
            int oldVal = nums[idx];
            if (isPrime[oldVal]) {
                TreeSet<Integer> indices = primeIndices.get(oldVal);
                int oldFirst = indices.first();
                int oldLast = indices.last();
                indices.remove(idx);
                if (indices.isEmpty()) {
                    primeIndices.remove(oldVal);
                    segmentTree.update(oldFirst + 1, oldLast, -1);
                } else {
                    int newFirst = indices.first();
                    int newLast = indices.last();

                    if (idx == oldFirst && newFirst != oldFirst) {
                        segmentTree.update(oldFirst + 1, newFirst, -1);
                    }
                    if (idx == oldLast && newLast != oldLast) {
                        segmentTree.update(newLast + 1, oldLast, -1);
                    }
                }
            }
            nums[idx] = val;
            if (isPrime[val]) {
                boolean wasNewPrime = !primeIndices.containsKey(val);
                TreeSet<Integer> indices = primeIndices.computeIfAbsent(val, k -> new TreeSet<>());
                int oldFirst = indices.isEmpty() ? -1 : indices.first();
                int oldLast = indices.isEmpty() ? -1 : indices.last();
                indices.add(idx);
                int newFirst = indices.first();
                int newLast = indices.last();
                if (wasNewPrime) {
                    segmentTree.update(newFirst + 1, newLast, 1);
                } else {
                    if (idx < oldFirst) {
                        segmentTree.update(newFirst + 1, oldFirst, 1);
                    }
                    if (idx > oldLast) {
                        segmentTree.update(oldLast + 1, newLast, 1);
                    }
                }
            }
            int totalDistinctPrimesInCurrentNums = primeIndices.size();
            int maxIntersection = segmentTree.queryMax();
            maxIntersection = Math.max(0, maxIntersection);
            result[q] = totalDistinctPrimesInCurrentNums + maxIntersection;
        }
        return result;
    }
}
