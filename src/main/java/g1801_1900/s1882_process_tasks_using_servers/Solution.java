package g1801_1900.s1882_process_tasks_using_servers;

// #Medium #Array #Heap_Priority_Queue #2022_05_06_Time_290_ms_(77.45%)_Space_69.1_MB_(95.62%)

import java.util.PriorityQueue;

public class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        PriorityQueue<Integer> serverq =
                new PriorityQueue<>(
                        (i1, i2) ->
                                servers[i1] != servers[i2] ? servers[i1] - servers[i2] : i1 - i2);
        for (int i = 0; i < servers.length; i++) {
            serverq.offer(i);
        }
        PriorityQueue<int[]> activetaskq = new PriorityQueue<>((i1, i2) -> i1[1] - i2[1]);
        int time = 0;
        int[] res = new int[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            time = Math.max(time, i);
            while (!activetaskq.isEmpty() && activetaskq.peek()[1] <= i) {
                int[] task = activetaskq.poll();
                serverq.offer(task[0]);
            }
            if (serverq.isEmpty()) {
                int[] toptask = activetaskq.peek();
                while (!activetaskq.isEmpty() && activetaskq.peek()[1] == toptask[1]) {
                    int[] task = activetaskq.poll();
                    serverq.offer(task[0]);
                }
                time = toptask[1];
            }
            int server = serverq.poll();
            res[i] = server;
            activetaskq.offer(new int[] {server, time + tasks[i]});
        }
        return res;
    }
}
