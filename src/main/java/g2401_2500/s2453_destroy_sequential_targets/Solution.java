package g2401_2500.s2453_destroy_sequential_targets;

// #Medium #Array #Hash_Table #Counting #2022_12_15_Time_71_ms_(71.07%)_Space_61.7_MB_(84.88%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import javafx.util.Pair;

public class Solution {
    public int destroyTargets(int[] nums, int space) {
        Arrays.sort(nums);
        Map<Integer, List<Integer>> freq = new HashMap<>();
        for (int num : nums) {
            int key = num % space;
            if (!freq.containsKey(key)) {
                freq.put(key, new ArrayList<>());
            }
            freq.get(key).add(num);
        }
        PriorityQueue<Pair<Integer, List<Integer>>> pq =
                new PriorityQueue<>(
                        (o1, o2) -> {
                            if (o1.getValue().size() < o2.getValue().size()) {
                                return 1;
                            }
                            if (o1.getValue().size() > o2.getValue().size()) {
                                return -1;
                            }
                            return o1.getValue().get(0).compareTo(o2.getValue().get(0));
                        });

        for (Map.Entry<Integer, List<Integer>> entry : freq.entrySet()) {
            pq.offer(new Pair<>(entry.getKey(), entry.getValue()));
        }

        return pq.poll().getValue().get(0);
    }
}
