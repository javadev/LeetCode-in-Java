package g0301_0400.s0352_data_stream_as_disjoint_intervals;

// #Hard #Binary_Search #Design #Ordered_Set

import java.util.*;

public class SummaryRanges {

    private final NavigableSet<int[]> intervals;
    private final Set<Integer> seen = new HashSet<>();

    public SummaryRanges() {
        this.intervals = new TreeSet<>(Comparator.comparingInt(i -> i[0]));
    }

    public void addNum(int val) {
        if (seen.contains(val)) {
            return;
        }
        seen.add(val);
        int[] interval = new int[] {val, val};
        this.intervals.add(interval);
        this.merge(interval);
    }

    public int[][] getIntervals() {
        int[][] res = new int[intervals.size()][2];
        int i = 0;
        for (int[] in : intervals) {
            res[i] = in;
            i++;
        }
        return res;
    }

    private void merge(int[] interval) {
        // base case
        if (interval == null) {
            return;
        }
        int[] lower = intervals.lower(interval);

        int[] higher;

        if (lower != null && lower[1] == interval[0] - 1) {
            lower[1] = interval[1];
            intervals.remove(interval);
            higher = intervals.higher(lower);
        } else {
            higher = intervals.higher(interval);
        }
        merge(higher);
    }
}
