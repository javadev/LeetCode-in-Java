package s0033_search_in_rotated_sorted_array;

public class Solution {
    public int search(int[] nums, int target) {

        int mid;
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            mid = ((hi - lo) >> 1) + lo;

            if (target == nums[mid]) return mid;
            if (nums[lo]
                    <= nums[mid]) // if this is true, then the possible rotation can only be in the
            // second half
            {
                if (nums[lo] <= target && target <= nums[mid])
                    hi = mid - 1; // the target is in the first half only if it's included
                // between nums[lo] and nums[mid]
                else lo = mid + 1;
            } else // otherwise, the possible rotation can only be in the first half
            {
                if (nums[mid] <= target && target <= nums[hi])
                    lo = mid + 1; // the target is in the second half only if it's included
                // between nums[hi] and nums[mid]
                else hi = mid - 1;
            }
        }
        return -1;
    }
}
