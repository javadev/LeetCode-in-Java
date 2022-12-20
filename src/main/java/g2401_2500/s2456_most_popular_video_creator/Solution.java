package g2401_2500.s2456_most_popular_video_creator;

// #Medium #Array #String #Hash_Table #Sorting #Heap_Priority_Queue
// #2022_12_16_Time_57_ms_(97.10%)_Space_85.2_MB_(99.42%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        HashMap<String, Long> totalViews = new HashMap<>();
        HashMap<String, Integer> maxView = new HashMap<>();
        long globalMaxView = 0;
        for (int i = 0; i < creators.length; i++) {
            long currentView = totalViews.getOrDefault(creators[i], 0L) + views[i];
            globalMaxView = Math.max(currentView, globalMaxView);
            totalViews.put(creators[i], currentView);
            int lastIndex = maxView.getOrDefault(creators[i], -1);
            if (!maxView.containsKey(creators[i])
                    || views[lastIndex] < views[i]
                    || (views[lastIndex] == views[i] && ids[lastIndex].compareTo(ids[i]) > 0)) {
                maxView.put(creators[i], i);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, Long> entry : totalViews.entrySet()) {
            if (entry.getValue() == globalMaxView) {
                res.add(Arrays.asList(entry.getKey(), ids[maxView.get(entry.getKey())]));
            }
        }
        return res;
    }
}
