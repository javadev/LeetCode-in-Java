package g0901_1000.s0933_number_of_recent_calls;

// #Easy #Design #Queue #Data_Stream

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
