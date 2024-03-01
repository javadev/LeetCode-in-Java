package g1601_1700.s1696_jump_game_vi;

// #Medium #Array #Dynamic_Programming #Heap_Priority_Queue #Sliding_Window #Queue #Monotonic_Queue
// #2022_04_13_Time_23_ms_(86.05%)_Space_56.4_MB_(95.27%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int maxResult(int[] nums, int k) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[] {0, nums[0]});
        for (int i = 1; i < nums.length; i++) {
            int max = deque.peek()[1];
            int[] next = new int[] {i, max + nums[i]};
            while (!deque.isEmpty() && deque.peekLast()[1] <= next[1]) {
                // PURGE FROM THE END
                deque.pollLast();
            }
            deque.offer(next);
            if (deque.peekFirst()[0] <= i - k) {
                // PURGE FROM THE HEAD
                deque.pollFirst();
            }
        }
        return deque.peekLast()[1];
    }
}
