package g1601_1700.s1687_delivering_boxes_from_storage_to_ports;

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue #Queue #Segment_Tree #Monotonic_Queue
// #2022_04_13_Time_9_ms_(91.09%)_Space_74.2_MB_(94.06%)

@SuppressWarnings("java:S1172")
public class Solution {
    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
        int t = 2;
        int weight = 0;
        int n = boxes.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        int left = 0;
        for (int right = 0; right < boxes.length; right++) {
            weight += boxes[right][1];
            if (right > 0 && boxes[right][0] != boxes[right - 1][0]) {
                t++;
            }
            // checking if weight, boxes are less than or equal to max contraint
            while (weight > maxWeight
                    || right - left >= maxBoxes
                    || (left < right && dp[left] == dp[left + 1])) {
                weight -= boxes[left][1];
                if (boxes[left][0] != boxes[left + 1][0]) {
                    t--;
                }
                left++;
            }
            dp[right + 1] = dp[left] + t;
        }
        return dp[n];
    }
}
