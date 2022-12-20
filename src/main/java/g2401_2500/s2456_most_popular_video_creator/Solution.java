package g2401_2500.s2456_most_popular_video_creator;

// #Medium #Array #String #Hash_Table #Sorting #Heap_(Priority_Queue)
// #2022_12_16_Time_57_ms_(97.10%)_Space_85.2_MB_(99.42%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        HashMap<String, Long> total_views = new HashMap<>();
        HashMap<String, Integer> max_view = new HashMap<>();
        long global_max_view = 0;

        for (int i = 0; i < creators.length; i++) {
            long current_view = total_views.getOrDefault(creators[i], 0L) + views[i];
            global_max_view = Math.max(current_view, global_max_view);
            total_views.put(creators[i], current_view);
            int last_index = max_view.getOrDefault(creators[i], -1);
            if (!max_view.containsKey(creators[i])
                    || views[last_index] < views[i]
                    || (views[last_index] == views[i] && ids[last_index].compareTo(ids[i]) > 0)) {
                max_view.put(creators[i], i);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (String key : total_views.keySet()) {
            if (total_views.get(key) == global_max_view)
                res.add(Arrays.asList(key, ids[max_view.get(key)]));
        }
        return res;
    }
}
