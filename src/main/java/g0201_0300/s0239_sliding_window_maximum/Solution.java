package g0201_0300.s0239_sliding_window_maximum;

// #Hard #Top_100_Liked_Questions #Array #Heap_Priority_Queue #Sliding_Window #Queue
// #Monotonic_Queue #Udemy_Arrays #Big_O_Time_O(n*k)_Space_O(n+k)
// #2022_07_04_Time_58_ms_(52.28%)_Space_145_MB_(50.60%)

import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int x = 0;
        LinkedList<Integer> dq = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            while (!dq.isEmpty() && dq.peekLast() < nums[j]) {
                dq.pollLast();
            }
            dq.addLast(nums[j]);
            if (j - i + 1 == k) {
                res[x] = dq.peekFirst();
                ++x;
                if (dq.peekFirst() == nums[i]) {
                    dq.pollFirst();
                }
                ++i;
            }
            ++j;
        }
        return res;
    }
}
