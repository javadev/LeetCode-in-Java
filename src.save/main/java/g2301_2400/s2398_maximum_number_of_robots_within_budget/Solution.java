package g2301_2400.s2398_maximum_number_of_robots_within_budget;

// #Hard #Array #Binary_Search #Heap_Priority_Queue #Prefix_Sum #Sliding_Window #Queue
// #2022_09_19_Time_15_ms_(99.75%)_Space_105.9_MB_(85.13%)

public class Solution {

    // use sliding window to track the largest in a way that the sliding window only grows.
    //   then the maximum size is the size of the sliding window at the end.
    // if condition is met, we just grow the sliding window.
    // if condition is not met, we shift the sliding window with the same size to the next position.
    // e.g., if [0,3] is valid, next time we will try [0,4].
    //       if [0,3] is invalid, next time we will try [1,4],
    //         by adjusting the window to [1,3] first in the current round.
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int n = chargeTimes.length;
        // [front, end).
        int[] deque = new int[n];
        int front = 0;
        int end = 0;
        long sum = 0;
        int left = 0;
        int right = 0;
        for (; right < n; ++right) {
            // add right into the sliding window, so the window becomes [left, right].
            // update sliding window max and window sum.
            while (end - front > 0 && chargeTimes[deque[end - 1]] <= chargeTimes[right]) {
                --end;
            }
            deque[end++] = right;
            sum += runningCosts[right];
            // if the condition is met in the window, do nothing,
            // so the next window size will become one larger.
            // if the condition is not met in the window, shrink one from the front,
            // so the next window size will stay the same.
            if (chargeTimes[deque[front]] + (right - left + 1) * sum > budget) {
                while (end - front > 0 && deque[front] <= left) {
                    ++front;
                }
                sum -= runningCosts[left];
                ++left;
            }
        }
        return right - left;
    }
}
