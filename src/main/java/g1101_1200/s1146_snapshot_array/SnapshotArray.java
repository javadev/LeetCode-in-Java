package g1101_1200.s1146_snapshot_array;

// #Medium #Array #Hash_Table #Binary_Search #Design #Binary_Search_II_Day_18
// #2022_03_05_Time_37_ms_(87.93%)_Space_75.2_MB_(81.59%)

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SnapshotArray {
    private int snapId = -1;
    private final Map<Integer, TreeMap<Integer, Integer>> indexToSnapMap;
    private final int[] ar;

    public SnapshotArray(int length) {
        indexToSnapMap = new HashMap<>();
        ar = new int[length];
    }

    public void set(int index, int val) {
        if (indexToSnapMap.containsKey(index)) {
            if (!indexToSnapMap.get(index).containsKey(snapId)) {
                indexToSnapMap.get(index).put(snapId, ar[index]);
            }
        } else {
            TreeMap<Integer, Integer> snapToValueMap = new TreeMap<>();
            snapToValueMap.put(snapId, ar[index]);
            indexToSnapMap.put(index, snapToValueMap);
        }
        ar[index] = val;
    }

    public int snap() {
        snapId++;
        return snapId;
    }

    public int get(int index, int snapId) {
        if (indexToSnapMap.containsKey(index)) {
            Map.Entry<Integer, Integer> value = indexToSnapMap.get(index).ceilingEntry(snapId);
            if (value != null) {
                return value.getValue();
            }
        }
        return ar[index];
    }
}
