package g0901_1000.s0933_number_of_recent_calls;

// #Easy #Design #Queue #Data_Stream #2022_03_30_Time_16_ms_(97.58%)_Space_50.8_MB_(80.12%)

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.offer(t);
        int min = t - 3000;
        while (min > q.peek()) {
            q.poll();
        }
        return q.size();
    }
}

/*
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
