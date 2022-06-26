package g1801_1900.s1851_minimum_interval_to_include_each_query;

// #Hard #Array #Sorting #Binary_Search #Heap_Priority_Queue #Line_Sweep
// #2022_05_08_Time_140_ms_(84.24%)_Space_90.2_MB_(82.06%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int numQuery = queries.length;

        int[][] queriesWithIndex = new int[numQuery][2];
        for (int i = 0; i < numQuery; i++) {
            queriesWithIndex[i] = new int[] {queries[i], i};
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(queriesWithIndex, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(a -> (a[1] - a[0])));

        int[] result = new int[numQuery];

        int j = 0;
        for (int i = 0; i < queries.length; i++) {
            int queryVal = queriesWithIndex[i][0];
            int queryIndex = queriesWithIndex[i][1];

            while (j < intervals.length && intervals[j][0] <= queryVal) {
                minHeap.add(intervals[j]);
                j++;
            }

            while (!minHeap.isEmpty() && minHeap.peek()[1] < queryVal) {
                minHeap.remove();
            }
            result[queryIndex] =
                    minHeap.isEmpty() ? -1 : (minHeap.peek()[1] - minHeap.peek()[0] + 1);
        }

        return result;
    }
}
