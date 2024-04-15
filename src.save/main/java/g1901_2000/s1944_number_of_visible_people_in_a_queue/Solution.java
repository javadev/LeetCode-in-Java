package g1901_2000.s1944_number_of_visible_people_in_a_queue;

// #Hard #Array #Stack #Monotonic_Stack #2022_05_18_Time_9_ms_(99.65%)_Space_160.6_MB_(44.01%)

public class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int size = heights.length;
        int[] stack = new int[size];
        int idx = 0;
        stack[0] = heights[size - 1];
        int[] visible = new int[size];
        for (int i = size - 2; i >= 0; i--) {
            int count = 0;
            while (idx >= 0 && heights[i] >= stack[idx]) {
                count++;
                idx--;
            }
            if (idx >= 0) {
                count++;
            }
            stack[++idx] = heights[i];
            visible[i] = count;
        }
        return visible;
    }
}
