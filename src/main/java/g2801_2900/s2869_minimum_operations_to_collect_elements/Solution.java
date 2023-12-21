package g2801_2900.s2869_minimum_operations_to_collect_elements;

// #Easy #Array #Hash_Table #2023_12_21_Time_1_ms_(100.00%)_Space_42.4_MB_(5.72%)

import java.util.List;

public class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Pair[] visited = new Pair[k + 1];
        visited[0] = new Pair(true, 0);
        int count = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            count++;
            if (nums.get(i) <= k && visited[nums.get(i)] == null) {
                visited[nums.get(i)] = new Pair(true, count);
            }
        }
        int fin = -1;
        for (Pair pair : visited) {
            if (pair != null) {
                fin = Math.max(fin, pair.totalVisitedTillNow);
            }
        }
        return fin;
    }

    private static class Pair {
        boolean isVisited;
        int totalVisitedTillNow;

        public Pair(boolean isVisited, int totalVisitedTillNow) {
            this.isVisited = isVisited;
            this.totalVisitedTillNow = totalVisitedTillNow;
        }
    }
}
