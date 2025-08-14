package g3601_3700.s3640_trionic_array_ii;

// #Hard #Array #Dynamic_Programming #Weekly_Contest_461
// #2025_08_14_Time_4_ms_(87.79%)_Space_61.72_MB_(36.78%)

public class Solution {
    public long maxSumTrionic(int[] nums) {
        int n = nums.length;
        // The original C++ code has undefined behavior for n=0 due to nums[0].
        // Returning 0 is a safe and conventional default for an empty array.
        if (n == 0) {
            return 0;
        }
        // A trionic shape needs at least a peak and a valley. The loop structure
        // naturally handles small arrays (n < 3) by not finding a valid result.
        long res = Long.MIN_VALUE;
        long psum = nums[0];
        // Pointers to track the subarray's shape:
        // The effective start of the subarray whose sum is in psum.
        int l = 0;
        // The index of the most recent "peak".
        int p = 0;
        // The index of the most recent "valley".
        int q = 0;
        // 'r' is the main iterator, expanding the window to the right.
        for (int r = 1; r < n; ++r) {
            psum += nums[r];
            if (nums[r - 1] == nums[r]) {
                l = r;
                psum = nums[r];
            } else if (nums[r - 1] > nums[r]) {
                if (r > 1 && nums[r - 2] < nums[r - 1]) {
                    p = r - 1;
                    while (l < q) {
                        psum -= nums[l];
                        l++;
                    }
                    while (l + 1 < p && nums[l] < 0) {
                        psum -= nums[l];
                        l++;
                    }
                }
            } else {
                if (r > 1 && nums[r - 2] > nums[r - 1]) {
                    q = r - 1;
                }
                if (l < p && p < q) {
                    res = Math.max(res, psum);
                }
            }
        }
        return res == Long.MIN_VALUE ? 0 : res;
    }
}
