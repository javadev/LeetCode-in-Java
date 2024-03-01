package g2201_2300.s2276_count_integers_in_intervals;

// #Hard #Design #Ordered_Set #Segment_Tree #2022_06_16_Time_137_ms_(64.87%)_Space_152.3_MB_(28.68%)

import java.util.Map;
import java.util.TreeMap;

public class CountIntervals {
    private final TreeMap<Integer, Integer> map;
    private int count;

    public CountIntervals() {
        map = new TreeMap<>();
        map.put(-1, -1);
        map.put(1_000_000_001, 1_000_000_001);
        count = 0;
    }

    public void add(int left, int right) {
        Map.Entry<Integer, Integer> item =
                map.floorEntry(left).getValue() < left
                        ? map.ceilingEntry(left)
                        : map.floorEntry(left);
        while (item.getKey() <= right) {
            left = Math.min(left, item.getKey());
            right = Math.max(right, item.getValue());
            count -= item.getValue() - item.getKey() + 1;
            map.remove(item.getKey());
            item = map.ceilingEntry(item.getKey());
        }

        map.put(left, right);
        count += right - left + 1;
    }

    public int count() {
        return count;
    }
}
