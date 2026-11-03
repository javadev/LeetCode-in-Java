package g1401_1500.s1425_constrained_subsequence_sum;

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue #Sliding_Window #Queue #Monotonic_Queue
// #2026_11_03_Time_13_ms_(99.66%)_Space_114.11_MB_(40.14%)

public class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;
        int[] deque = new int[n];
        int front = 0;
        int rear = 0;
        int ans = nums[0];
        for (int i = 0; i < n; i++) {
            while (front < rear && deque[front] < i - k) {
                front++;
            }
            if (front < rear && nums[deque[front]] > 0) {
                nums[i] += nums[deque[front]];
            }
            ans = Math.max(ans, nums[i]);
            while (front < rear && nums[deque[rear - 1]] <= nums[i]) {
                rear--;
            }
            deque[rear++] = i;
        }
        return ans;
    }
}
