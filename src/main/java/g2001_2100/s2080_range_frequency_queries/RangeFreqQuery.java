package g2001_2100.s2080_range_frequency_queries;

// #Medium #Array #Hash_Table #Binary_Search #Design #Segment_Tree
// #2022_03_31_Time_140_ms_(97.86%)_Space_135.9_MB_(93.16%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RangeFreqQuery {
    private Map<Integer, List<Integer>> map;

    public RangeFreqQuery(int[] arr) {
        map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }
    }

    public int query(int left, int right, int value) {
        if (!map.containsKey(value)) {
            return 0;
        }
        List<Integer> list = map.get(value);
        int s = Collections.binarySearch(list, left);
        int e = Collections.binarySearch(list, right);
        if (s < 0) {
            s = (s + 1) * -1;
        }
        if (e < 0) {
            e = (e + 2) * -1;
        }
        return e - s + 1;
    }
}

/*
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */
