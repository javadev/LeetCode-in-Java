package g3201_3300.s3206_alternating_groups_i;

// #Easy #Array #Sliding_Window #2024_07_09_Time_1_ms_(97.24%)_Space_42.8_MB_(90.31%)

public class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count = 0;
        if (colors[n - 1] != colors[0] && colors[0] != colors[1]) {
            count++;
        }
        if (colors[n - 1] != colors[0] && colors[n - 1] != colors[n - 2]) {
            count++;
        }
        for (int i = 1; i < n - 1; i++) {
            if (colors[i] != colors[i - 1] && colors[i] != colors[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
