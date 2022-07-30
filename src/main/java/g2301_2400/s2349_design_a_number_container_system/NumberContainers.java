package g2301_2400.s2349_design_a_number_container_system;

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
// #2022_07_30_Time_208_ms_(54.57%)_Space_166.7_MB_(43.08%)

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

@SuppressWarnings("java:S1186")
public class NumberContainers {
    private Map<Integer, TreeSet<Integer>> indices = new HashMap<>();
    private Map<Integer, Integer> vals = new HashMap<>();

    public NumberContainers() {}

    public void change(int index, int number) {
        if (vals.containsKey(index)) {
            int old = vals.get(index);
            indices.get(old).remove(index);
            if (indices.get(old).isEmpty()) {
                indices.remove(old);
            }
        }
        vals.put(index, number);
        indices.computeIfAbsent(number, s -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        if (indices.containsKey(number)) {
            return indices.get(number).first();
        }
        return -1;
    }
}

/*
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
