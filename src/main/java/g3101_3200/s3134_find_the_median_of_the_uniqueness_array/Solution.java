package g3101_3200.s3134_find_the_median_of_the_uniqueness_array;

// #Hard #Array #Hash_Table #Binary_Search #Sliding_Window
// #2024_05_02_Time_47_ms_(100.00%)_Space_56.8_MB_(91.38%)

public class Solution {
    public int medianOfUniquenessArray(int[] nums) {
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }
        int n = nums.length;
        long k = ((long) n * (n + 1) / 2 + 1) / 2;
        int left = 0;
        int right = n / 2;
        while (left <= right) {
            int mid = left + right >> 1;
            if (check(nums, max, mid, k)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean check(int[] nums, int max, int target, long k) {
        long count = 0;
        int distinct = 0;
        int n = nums.length;
        int left = 0;
        int right = 0;
        int[] freq = new int[max + 1];
        while (right < n) {
            int x = nums[right++];
            if (++freq[x] == 1) {
                distinct++;
            }
            while (distinct > target) {
                x = nums[left++];
                if (--freq[x] == 0) {
                    distinct--;
                }
            }
            count += right - left;
            if (count >= k) {
                return true;
            }
        }
        return false;
    }
}
