package g3001_3100.s3049_earliest_second_to_mark_indices_ii;

// #Hard #Array #Greedy #Binary_Search #Heap_Priority_Queue
// #2024_03_04_Time_5_ms_(92.03%)_Space_44.5_MB_(91.30%)

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Solution {
    private int[] nums;
    private int[] changeIndices;
    private boolean[] first;
    private long sum;

    public int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
        int m = changeIndices.length;
        int n = nums.length;
        if (m < n) {
            return -1;
        }
        this.nums = nums;
        this.changeIndices = changeIndices;
        Set<Integer> set = new HashSet<>();
        first = new boolean[m];
        for (int i = 0; i < m; i++) {
            if (nums[changeIndices[i] - 1] > 1 && set.add(changeIndices[i])) {
                first[i] = true;
            }
        }
        for (int num : nums) {
            sum += num;
        }
        sum += n;
        int l = n;
        int r = ((int) Math.min(sum, m)) + 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (check(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l > Math.min(sum, m) ? -1 : l;
    }

    private boolean check(int idx) {
        Queue<Integer> pq = new PriorityQueue<>();
        long need = sum;
        int count = 0;
        for (int i = idx - 1; i >= 0 && need > idx; i--) {
            if (!first[i]) {
                count++;
                continue;
            }
            pq.add(nums[changeIndices[i] - 1]);
            need -= nums[changeIndices[i] - 1] - 1;
            if (pq.size() > count) {
                need += pq.poll() - 1;
                count++;
            }
        }
        return need <= idx;
    }
}
