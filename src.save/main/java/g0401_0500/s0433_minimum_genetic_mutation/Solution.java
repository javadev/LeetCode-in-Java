package g0401_0500.s0433_minimum_genetic_mutation;

// #Medium #String #Hash_Table #Breadth_First_Search #Graph_Theory_I_Day_12_Breadth_First_Search
// #2022_07_16_Time_1_ms_(90.95%)_Space_41.9_MB_(56.72%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

@SuppressWarnings("java:S3012")
public class Solution {
    private List<String> isInBank(Set<String> set, String cur) {
        List<String> res = new ArrayList<>();
        for (String each : set) {
            int diff = 0;
            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) != cur.charAt(i)) {
                    diff++;
                    if (diff > 1) {
                        break;
                    }
                }
            }
            if (diff == 1) {
                res.add(each);
            }
        }
        return res;
    }

    public int minMutation(String start, String end, String[] bank) {
        Set<String> set = new HashSet<>();
        for (String s : bank) {
            set.add(s);
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        int step = 0;
        while (!queue.isEmpty()) {
            int curSize = queue.size();
            while (curSize-- > 0) {
                String cur = queue.poll();
                if (cur.equals(end)) {
                    return step;
                }
                for (String next : isInBank(set, cur)) {
                    queue.offer(next);
                    set.remove(next);
                }
            }
            step++;
        }
        return -1;
    }
}
