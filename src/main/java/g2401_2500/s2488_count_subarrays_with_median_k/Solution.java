package g2401_2500.s2488_count_subarrays_with_median_k;

// #Hard #Array #Hash_Table #Prefix_Sum #2023_01_26_Time_24_ms_(72.25%)_Space_51_MB_(99.24%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countSubarrays(int[] nums, int k) {
        int idx;
        int n = nums.length;
        int ans = 0;
        for (idx = 0; idx < n; idx++) {
            if (nums[idx] == k) {
                break;
            }
        }
        int[][] arr = new int[n - idx][2];
        int j = 1;
        for (int i = idx + 1; i < n; i++) {
            if (nums[i] < k) {
                arr[j][0] = arr[j - 1][0] + 1;
                arr[j][1] = arr[j - 1][1];
            } else {
                arr[j][1] = arr[j - 1][1] + 1;
                arr[j][0] = arr[j - 1][0];
            }
            j++;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] ints : arr) {
            int d2 = ints[1] - ints[0];
            map.put(d2, map.getOrDefault(d2, 0) + 1);
        }
        int s1 = 0;
        int g1 = 0;
        for (int i = idx; i >= 0; i--) {
            if (nums[i] < k) {
                s1++;
            } else if (nums[i] > k) {
                g1++;
            }
            int d1 = g1 - s1;
            int cur = map.getOrDefault(-d1, 0) + map.getOrDefault(1 - d1, 0);
            ans += cur;
        }
        return ans;
    }
}
