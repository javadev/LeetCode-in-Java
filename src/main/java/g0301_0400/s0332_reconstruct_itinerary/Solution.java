package g0301_0400.s0332_reconstruct_itinerary;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    private Map<String, PriorityQueue<String>> map = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> map = new HashMap<>();
        LinkedList<String> ans = new LinkedList<>();
        for (int i = 0; i < tickets.size(); i++) {
            String src = tickets.get(i).get(0);
            String dest = tickets.get(i).get(1);
            PriorityQueue<String> pq = map.getOrDefault(src, new PriorityQueue<>());
            pq.add(dest);
            map.put(src, pq);
        }
        dfs(map, "JFK", ans);
        return ans;
    }

    private void dfs(Map<String, PriorityQueue<String>> map, String src, LinkedList<String> ans) {
        PriorityQueue<String> temp = map.get(src);
        while (temp != null && temp.size() > 0) {
            String nbr = temp.remove();
            dfs(map, nbr, ans);
        }
        ans.addFirst(src);
    }
}
