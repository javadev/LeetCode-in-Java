package g3401_3500.s3478_choose_k_elements_with_maximum_sum;

// #Medium #Array #Sorting #Heap_Priority_Queue
// #2025_03_10_Time_157_ms_(100.00%)_Space_62.83_MB_(100.00%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums1[i];
            arr[i][1] = nums2[i];
            arr[i][2] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        long[] ans = new long[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i - 1][0] == arr[i][0]) {
                ans[arr[i][2]] = ans[arr[i - 1][2]];
            } else {
                ans[arr[i][2]] = sum;
            }
            pq.add(arr[i][1]);
            sum += arr[i][1];
            if (pq.size() > k) {
                sum -= pq.remove();
            }
        }
        return ans;
    }
}
