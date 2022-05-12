package g1901_2000.s1906_minimum_absolute_difference_queries;

// #Medium #Array #Hash_Table #2022_05_11_Time_176_ms_(71.61%)_Space_82.6_MB_(95.48%)

import java.util.Arrays;
import java.util.BitSet;

public class Solution {
    private static class SegmentTree {
        static class Node {
            BitSet bits;
            int minDiff;
        }

        int len;
        int[] nums;
        Node[] tree;
        static final int INF = 200;

        SegmentTree(int[] nums, int len) {
            this.nums = Arrays.copyOf(nums, len);
            this.len = len;
            tree = new Node[4 * len];
            buildTree(0, len - 1, 0);
        }

        private void buildTree(int i, int j, int ti) {
            if (i <= j) {
                if (i == j) {
                    Node node = new Node();
                    node.bits = new BitSet(101);
                    node.bits.set(nums[i]);
                    node.minDiff = INF;
                    tree[ti] = node;
                } else {
                    int mid = i + (j - i) / 2;
                    buildTree(i, mid, 2 * ti + 1);
                    buildTree(mid + 1, j, 2 * ti + 2);
                    tree[ti] = combineNodes(tree[2 * ti + 1], tree[2 * ti + 2]);
                }
            }
        }

        private Node combineNodes(Node n1, Node n2) {
            Node node = new Node();
            if (n1.minDiff == 1 || n2.minDiff == 1) {
                node.minDiff = 1;
            } else {
                node.bits = new BitSet(101);
                node.bits.or(n1.bits);
                node.bits.or(n2.bits);
                node.minDiff = findMinDiff(node.bits);
            }
            return node;
        }

        private int findMinDiff(BitSet bits) {
            // minimum value of number is 1.
            int first = bits.nextSetBit(1);
            int minDiff = INF;
            while (first != -1) {
                int next = bits.nextSetBit(first + 1);
                if (next != -1) {
                    minDiff = Math.min(minDiff, next - first);
                    if (minDiff == 1) {
                        break;
                    }
                }
                first = next;
            }
            return minDiff;
        }

        private int findMinAbsDiff(int start, int end, int i, int j, int ti) {
            Node node = findMinAbsDiff2(start, end, i, j, ti);
            return node.minDiff == INF ? -1 : node.minDiff;
        }

        private Node findMinAbsDiff2(int start, int end, int i, int j, int ti) {
            if (i == start && j == end) {
                return tree[ti];
            }
            int mid = i + (j - i) / 2;
            if (end <= mid) {
                return findMinAbsDiff2(start, end, i, mid, 2 * ti + 1);
            } else if (start >= mid + 1) {
                return findMinAbsDiff2(start, end, mid + 1, j, 2 * ti + 2);
            } else {
                Node left = findMinAbsDiff2(start, mid, i, mid, 2 * ti + 1);
                Node right = findMinAbsDiff2(mid + 1, end, mid + 1, j, 2 * ti + 2);
                return combineNodes(left, right);
            }
        }
    }

    public int[] minDifference(int[] nums, int[][] queries) {
        int len = nums.length;
        int qlen = queries.length;
        SegmentTree st = new SegmentTree(nums, len);
        int[] answer = new int[qlen];
        for (int i = 0; i < qlen; ++i) {
            answer[i] = st.findMinAbsDiff(queries[i][0], queries[i][1], 0, len - 1, 0);
        }
        return answer;
    }
}
