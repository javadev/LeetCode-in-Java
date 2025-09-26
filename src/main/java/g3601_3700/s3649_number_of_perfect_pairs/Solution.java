package g3601_3700.s3649_number_of_perfect_pairs;

// #Medium #Array #Math #Sorting #Two_Pointers #Biweekly_Contest_163
// #2025_09_26_Time_44_ms_(71.88%)_Space_59.91_MB_(26.12%)

import java.util.Arrays;

public class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs((long) nums[i]);
        }
        Arrays.sort(arr);
        long cnt = 0;
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (r < i) {
                r = i;
            }
            while (r + 1 < n && arr[r + 1] <= 2 * arr[i]) {
                r++;
            }
            cnt += (r - i);
        }
        return cnt;
    }
}
