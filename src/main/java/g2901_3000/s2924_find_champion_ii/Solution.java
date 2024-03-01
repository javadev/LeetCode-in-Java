package g2901_3000.s2924_find_champion_ii;

// #Medium #Graph #2023_12_29_Time_1_ms_(100.00%)_Space_46_MB_(5.87%)

public class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] arr = new int[n];
        for (int[] adj : edges) {
            arr[adj[1]]++;
        }
        int cnt = 0;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                cnt++;
                ans = i;
            }
        }
        if (cnt == 1) {
            return ans;
        } else {
            return -1;
        }
    }
}
