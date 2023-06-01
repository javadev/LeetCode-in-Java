package g1101_1200.s1146_snapshot_array;

// #Medium #Array #Hash_Table #Binary_Search #Design #Binary_Search_II_Day_18
// #2023_06_01_Time_68_ms_(45.86%)_Space_78.9_MB_(59.57%)

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

/*
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
