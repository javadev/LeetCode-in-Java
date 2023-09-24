package g2701_2800.s2762_continuous_subarrays;

// #Medium #Array #Heap_Priority_Queue #Sliding_Window #Ordered_Set #Queue #Monotonic_Queue
// #2023_09_24_Time_3_ms_(98.28%)_Space_56.8_MB_(61.59%)

public class Solution {
    public long continuousSubarrays(int[] nums) {
        long res = 1;
        int lower = nums[0] - 2;
        int higher = nums[0] + 2;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= lower && nums[i] <= higher) {
                lower = Math.max(lower, nums[i] - 2);
                higher = Math.min(higher, nums[i] + 2);
            } else {
                j = i - 1;
                lower = nums[i] - 2;
                higher = nums[i] + 2;
                while (j >= 0 && nums[j] >= lower && nums[j] <= higher) {
                    lower = Math.max(lower, nums[j] - 2);
                    higher = Math.min(higher, nums[j] + 2);
                    j--;
                }
                j++;
            }
            res += i - j + 1;
        }
        return res;
    }
}
