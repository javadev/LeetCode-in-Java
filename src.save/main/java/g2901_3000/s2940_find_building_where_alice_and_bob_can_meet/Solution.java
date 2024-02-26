package g2901_3000.s2940_find_building_where_alice_and_bob_can_meet;

// #Hard #Array #Binary_Search #Stack #Heap_Priority_Queue #Monotonic_Stack #Segment_Tree
// #Binary_Indexed_Tree #2024_01_03_Time_19_ms_(94.91%)_Space_65.5_MB_(62.16%)

import java.util.LinkedList;

public class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int n = heights.length;
        int[] gr = new int[n];
        LinkedList<Integer> l = new LinkedList<>();
        l.offer(n - 1);
        gr[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (!l.isEmpty() && heights[i] > heights[l.peek()]) {
                l.pop();
            }
            if (!l.isEmpty()) {
                gr[i] = l.peek();
            } else {
                gr[i] = -1;
            }
            l.push(i);
        }
        int[] ans = new int[queries.length];
        int i = 0;
        for (int[] a : queries) {
            int x = gr[a[0]];
            int y = gr[a[1]];
            if (a[0] == a[1]) {
                ans[i++] = a[0];
            } else if (a[0] < a[1] && heights[a[0]] < heights[a[1]]) {
                ans[i++] = a[1];
            } else if (a[1] < a[0] && heights[a[1]] < heights[a[0]]) {
                ans[i++] = a[0];
            } else if (x == -1 || y == -1) {
                ans[i++] = -1;
            } else {
                int m = Math.max(a[0], a[1]);
                while (m < heights.length
                        && m != -1
                        && (heights[m] <= heights[a[0]] || heights[m] <= heights[a[1]])) {
                    m = gr[m];
                }
                if (m >= heights.length || m == -1) {
                    ans[i++] = -1;
                } else {
                    ans[i++] = m;
                }
            }
        }
        return ans;
    }
}
