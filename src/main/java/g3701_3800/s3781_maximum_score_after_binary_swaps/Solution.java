package g3701_3800.s3781_maximum_score_after_binary_swaps;

// #Medium #Array #String #Greedy #Heap_Priority_Queue #Staff #Biweekly_Contest_172
// #2026_05_06_Time_39_ms_(96.47%)_Space_118.00_MB_(29.41%)

public class Solution {
    public long maximumScore(int[] nums, String s) {
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < nums.length; i++) {
            if (s.charAt(i) == '1') {
                if (pq.isEmpty() || pq.peek() <= nums[i]) {
                    sum += nums[i];
                } else {
                    sum += pq.poll();
                    pq.add(nums[i]);
                }
            } else {
                pq.add(nums[i]);
            }
        }
        return sum;
    }
}
