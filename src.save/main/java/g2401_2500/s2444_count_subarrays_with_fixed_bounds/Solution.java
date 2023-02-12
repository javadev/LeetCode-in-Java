package g2401_2500.s2444_count_subarrays_with_fixed_bounds;

// #Hard #Array #Sliding_Window #Queue #Monotonic_Queue
// #2022_12_14_Time_9_ms_(83.94%)_Space_56.5_MB_(97.01%)

public class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] >= minK && nums[i] <= maxK) {
                int a = i;
                int b = i;
                int mini = 0;
                int maxi = 0;
                while (i != nums.length && (nums[i] >= minK && nums[i] <= maxK)) {
                    i++;
                }
                while (true) {
                    for (; b != i && (mini == 0 || maxi == 0); b++) {
                        if (nums[b] == minK) {
                            mini++;
                        }
                        if (nums[b] == maxK) {
                            maxi++;
                        }
                    }
                    if (mini == 0 || maxi == 0) {
                        break;
                    }
                    for (; mini != 0 && maxi != 0; ans += 1 + (i - b), a++) {
                        if (nums[a] == minK) {
                            mini--;
                        }
                        if (nums[a] == maxK) {
                            maxi--;
                        }
                    }
                }
            }
            i++;
        }
        return ans;
    }
}
