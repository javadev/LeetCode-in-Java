package g1501_1600.s1600_throne_inheritance;

// #Medium #Hash_Table #Depth_First_Search #Tree #Design
// #2022_04_01_Time_267_ms_(90.38%)_Space_114.3_MB_(85.58%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThroneInheritance {
    private String king;
    private HashMap<String, LinkedHashSet<String>> graph;
    private HashSet<String> isDead;

    public ThroneInheritance(String kingName) {
        king = kingName;
        graph = new HashMap<>();
        isDead = new HashSet<>();
        graph.put(kingName, new LinkedHashSet<>());
    }

    public void birth(String parentName, String childName) {
        graph.putIfAbsent(parentName, new LinkedHashSet<>());
        graph.get(parentName).add(childName);
    }

    public void death(String name) {
        isDead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> inheritance = new ArrayList<>();
        HashSet<String> visited = new HashSet<>();
        dfs(graph, king, inheritance, visited);
        return inheritance;
    }

    public void dfs(
            Map<String, LinkedHashSet<String>> graph,
            String src,
            List<String> l,
            Set<String> visited) {
        visited.add(src);
        if (!isDead.contains(src)) {
            l.add(src);
        }
        if (!graph.containsKey(src)) {
            return;
        }
        for (String s : graph.get(src)) {
            if (!visited.contains(s)) {
                dfs(graph, s, l, visited);
            }
        }
    }
}
