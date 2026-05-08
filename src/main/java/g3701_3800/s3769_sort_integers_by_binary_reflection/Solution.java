package g3701_3800.s3769_sort_integers_by_binary_reflection;

// #Easy #Array #Sorting #Mid_Level #Weekly_Contest_479
// #2026_05_08_Time_5_ms_(97.23%)_Space_46.52_MB_(97.70%)

import java.util.PriorityQueue;

public class Solution {
    public int[] sortByReflection(int[] nums) {
        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>(
                        (a, b) -> {
                            if (a[1] == b[1]) {
                                return Integer.compare(a[0], b[0]);
                            }
                            return Integer.compare(a[1], b[1]);
                        });
        int[] sortedByReflection = new int[nums.length];
        for (int num : nums) {
            minHeap.offer(new int[] {num, reverseBinary(num)});
        }
        int idx = 0;
        while (!minHeap.isEmpty()) {
            sortedByReflection[idx++] = minHeap.poll()[0];
        }

        return sortedByReflection;
    }

    private int reverseBinary(int num) {
        int reversed = 0;
        while (num > 0) {
            int lastBit = num & 1;
            reversed = (reversed << 1) | lastBit;
            num = num >> 1;
        }
        return reversed;
    }
}
