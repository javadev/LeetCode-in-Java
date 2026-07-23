package g3801_3900.s3842_toggle_light_bulbs;

// #Easy #Array #Hash_Table #Sorting #Simulation #Mid_Level #Weekly_Contest_489
// #2026_07_22_Time_2_ms_(99.86%)_Space_46.70_MB_(58.12%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] on = new boolean[101];
        for (int b : bulbs) {
            on[b] = !on[b];
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < 101; ++i) {
            if (on[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}
