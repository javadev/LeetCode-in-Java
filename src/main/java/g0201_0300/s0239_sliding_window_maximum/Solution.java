package g0201_0300.s0239_sliding_window_maximum;

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
            while (dq.size() > 0 && dq.peekLast() < nums[j]) {
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
