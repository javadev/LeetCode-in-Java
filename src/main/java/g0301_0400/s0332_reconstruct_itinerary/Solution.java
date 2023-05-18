package g0301_0400.s0332_reconstruct_itinerary;

// #Hard #Depth_First_Search #Graph #Eulerian_Circuit
// #2022_07_10_Time_4_ms_(100.00%)_Space_43_MB_(91.20%)

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> map = new HashMap<>();
        LinkedList<String> ans = new LinkedList<>();
        for (List<String> ticket : tickets) {
            String src = ticket.get(0);
            String dest = ticket.get(1);
            PriorityQueue<String> pq = map.getOrDefault(src, new PriorityQueue<>());
            pq.add(dest);
            map.put(src, pq);
        }
        dfs(map, "JFK", ans);
        return ans;
    }

    private void dfs(Map<String, PriorityQueue<String>> map, String src, LinkedList<String> ans) {
        PriorityQueue<String> temp = map.get(src);
        while (temp != null && !temp.isEmpty()) {
            String nbr = temp.remove();
            dfs(map, nbr, ans);
        }
        ans.addFirst(src);
    }
}
