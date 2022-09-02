package g1301_1400.s1376_time_needed_to_inform_all_employees;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Programming_Skills_II_Day_11
// #Graph_Theory_I_Day_9_Standard_Traversal
// #2022_03_21_Time_225_ms_(22.36%)_Space_121.5_MB_(65.53%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("java:S1172")
public class Solution {
    private static class Pair {
        int emp;
        int time;

        Pair(int emp, int time) {
            this.emp = emp;
            this.time = time;
        }
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int head = -1;
        for (int i = 0; i < manager.length; i++) {
            if (manager[i] == -1) {
                head = i;
                continue;
            }
            int man = manager[i];
            map.putIfAbsent(man, new ArrayList<>());
            map.get(man).add(i);
        }
        int maxtime = 0;
        Queue<Pair> que = new ArrayDeque<>();
        que.add(new Pair(head, informTime[head]));
        while (!que.isEmpty()) {
            Pair rem = que.remove();
            maxtime = Math.max(rem.time, maxtime);
            if (map.containsKey(rem.emp)) {
                for (int under : map.get(rem.emp)) {
                    que.add(new Pair(under, rem.time + informTime[under]));
                }
            }
        }
        return maxtime;
    }
}
