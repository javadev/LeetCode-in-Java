package g3401_3500.s3486_longest_special_path_ii;

// #Hard #2025_03_16_Time_178_ms_(_%)_Space_102.66_MB_(_%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] longestSpecialPath(int[][] edges, int[] nums) {
        int[] ans = {0, 1};
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            int c = edge[2];
            graph.computeIfAbsent(a, k -> new ArrayList<>()).add(new int[] {b, c});
            graph.computeIfAbsent(b, k -> new ArrayList<>()).add(new int[] {a, c});
        }
        List<Integer> costs = new ArrayList<>();
        Map<Integer, Integer> last = new HashMap<>();
        dfs(0, 0, -1, new ArrayList<>(Arrays.asList(0, 0)), nums, graph, costs, last, ans);
        return ans;
    }

    private void dfs(
            int node,
            int currCost,
            int prev,
            List<Integer> left,
            int[] nums,
            Map<Integer, List<int[]>> graph,
            List<Integer> costs,
            Map<Integer, Integer> last,
            int[] ans) {
        int nodeColorIndexPrev = last.getOrDefault(nums[node], -1);
        last.put(nums[node], costs.size());
        costs.add(currCost);
        int diff = currCost - costs.get(left.get(0));
        int length = costs.size() - left.get(0);
        if (diff > ans[0] || (diff == ans[0] && length < ans[1])) {
            ans[0] = diff;
            ans[1] = length;
        }
        for (int[] next : graph.getOrDefault(node, new ArrayList<>())) {
            int nextNode = next[0];
            int nextCost = next[1];
            if (nextNode == prev) {
                continue;
            }
            List<Integer> nextLeft = new ArrayList<>(left);
            if (last.containsKey(nums[nextNode])) {
                nextLeft.add(last.get(nums[nextNode]) + 1);
            }
            nextLeft.sort(Comparator.naturalOrder());
            while (nextLeft.size() > 2) {
                nextLeft.remove(0);
            }
            dfs(nextNode, currCost + nextCost, node, nextLeft, nums, graph, costs, last, ans);
        }
        last.put(nums[node], nodeColorIndexPrev);
        costs.remove(costs.size() - 1);
    }
}
