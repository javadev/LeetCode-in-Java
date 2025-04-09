package g3501_3600.s3510_minimum_pair_removal_to_sort_array_ii;

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Simulation #Linked_List #Ordered_Set
// #Doubly_Linked_List #2025_04_09_Time_289_ms_(99.58%)_Space_82.88_MB_(17.23%)

public class Solution {
    private static class Segment {
        private final int start;
        private final int end;
        private Segment left;
        private Segment right;
        private int lIdx;
        private long lNum;
        private int rIdx;
        private long rNum;
        private boolean ok;
        private long minSum;
        private int li;
        private int ri;

        public static Segment init(int[] arr) {
            return new Segment(arr, 0, arr.length - 1);
        }

        public Segment(int[] arr, int s, int e) {
            start = s;
            end = e;
            if (s >= e) {
                lIdx = rIdx = s;
                lNum = rNum = arr[s];
                minSum = Long.MAX_VALUE;
                ok = true;
                return;
            }
            int mid = s + ((e - s) >> 1);
            left = new Segment(arr, s, mid);
            right = new Segment(arr, mid + 1, e);
            merge();
        }

        private void merge() {
            lIdx = left.lIdx;
            lNum = left.lNum;
            rIdx = right.rIdx;
            rNum = right.rNum;
            ok = left.ok && right.ok && left.rNum <= right.lNum;
            minSum = left.minSum;
            li = left.li;
            ri = left.ri;
            if (left.rNum + right.lNum < minSum) {
                minSum = left.rNum + right.lNum;
                li = left.rIdx;
                ri = right.lIdx;
            }
            if (right.minSum < minSum) {
                minSum = right.minSum;
                li = right.li;
                ri = right.ri;
            }
        }

        public void update(int i, long n) {
            if (start <= i && end >= i) {
                if (start >= end) {
                    lNum = rNum = n;
                } else {
                    left.update(i, n);
                    right.update(i, n);
                    merge();
                }
            }
        }

        public Segment remove(int i) {
            if (start > i || end < i) {
                return this;
            } else if (start >= end) {
                return null;
            }
            left = left.remove(i);
            right = right.remove(i);
            if (null == left) {
                return right;
            } else if (null == right) {
                return left;
            }
            merge();
            return this;
        }
    }

    public int minimumPairRemoval(int[] nums) {
        Segment root = Segment.init(nums);
        int res = 0;
        while (!root.ok) {
            int l = root.li;
            int r = root.ri;
            root.update(l, root.minSum);
            root = root.remove(r);
            res++;
        }
        return res;
    }
}
