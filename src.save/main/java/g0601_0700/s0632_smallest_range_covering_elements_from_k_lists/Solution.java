package g0601_0700.s0632_smallest_range_covering_elements_from_k_lists;

// #Hard #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Sliding_Window
// #2022_03_21_Time_31_ms_(87.39%)_Space_57.6_MB_(18.58%)

import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

public class Solution {
    @SuppressWarnings("java:S1210")
    static class Triplet implements Comparable<Triplet> {
        int value;
        int row;
        int idx;

        Triplet(int value, int row, int idx) {
            this.value = value;
            this.row = row;
            this.idx = idx;
        }

        public int compareTo(Triplet obj) {
            return this.value - obj.value;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int maxInPq = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            pq.add(new Triplet(nums.get(i).get(0), i, 0));
            if (maxInPq < nums.get(i).get(0)) {
                maxInPq = nums.get(i).get(0);
            }
        }
        int rangeSize = maxInPq - Objects.requireNonNull(pq.peek()).value + 1;
        int rangeLeft = Objects.requireNonNull(pq.peek()).value;
        int rangeRight = maxInPq;
        while (true) {
            Triplet nextNumber = pq.remove();
            if (nextNumber.idx + 1 < nums.get(nextNumber.row).size()) {
                int val = nums.get(nextNumber.row).get(nextNumber.idx + 1);
                if (val > maxInPq) {
                    maxInPq = val;
                }
                pq.add(new Triplet(val, nextNumber.row, nextNumber.idx + 1));
                if (maxInPq - Objects.requireNonNull(pq.peek()).value + 1 < rangeSize) {
                    rangeSize = maxInPq - pq.peek().value + 1;
                    rangeLeft = maxInPq;
                    rangeRight = pq.peek().value;
                }
            } else {
                break;
            }
        }
        int[] answer = new int[2];
        answer[0] = rangeLeft;
        answer[1] = rangeRight;
        return answer;
    }
}
