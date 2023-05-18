package g1601_1700.s1629_slowest_key;

// #Easy #Array #String #2022_04_18_Time_4_ms_(14.60%)_Space_42.9_MB_(72.62%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < releaseTimes.length; i++) {
            char c = keysPressed.charAt(i);
            int duration;
            if (i == 0) {
                duration = releaseTimes[i];
            } else {
                duration = releaseTimes[i] - releaseTimes[i - 1];
            }
            if (!map.containsKey(c)) {
                map.put(c, duration);
            } else {
                int val = map.get(c);
                if (duration > val) {
                    map.put(c, duration);
                }
            }
        }
        Map<Integer, List<Character>> map2 = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int duration = entry.getValue();
            if (!map2.containsKey(duration)) {
                map2.put(duration, new ArrayList<>());
            }
            map2.get(duration).add(entry.getKey());
        }
        int max = -1;
        for (Map.Entry<Integer, List<Character>> entry : map2.entrySet()) {
            List<Character> chars = entry.getValue();
            Collections.sort(chars);
            map2.put(entry.getKey(), chars);
            max = Math.max(max, entry.getKey());
        }
        return map2.get(max).get(map2.get(max).size() - 1);
    }
}
