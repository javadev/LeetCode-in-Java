package g0801_0900.s0841_keys_and_rooms;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Data_Structure_II_Day_19_Graph
// #Graph_Theory_I_Day_7_Standard_Traversal #2022_03_24_Time_3_ms_(51.54%)_Space_42.3_MB_(75.53%)

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        TreeSet<Integer> treeSet = new TreeSet<>(rooms.get(0));
        while (!treeSet.isEmpty()) {
            Integer key = treeSet.pollFirst();
            if (!visited.add(key)) {
                continue;
            }
            if (visited.size() == rooms.size()) {
                return true;
            }
            treeSet.addAll(rooms.get(key));
        }
        return visited.size() == rooms.size();
    }
}
