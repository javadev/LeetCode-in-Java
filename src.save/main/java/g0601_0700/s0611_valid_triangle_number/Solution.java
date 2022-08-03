package g0601_0700.s0611_valid_triangle_number;

// #Medium #Array #Sorting #Greedy #Binary_Search #Two_Pointers #Binary_Search_II_Day_1
// #2022_03_21_Time_10_ms_(100.00%)_Space_45_MB_(5.06%)

public class Solution {
    public int triangleNumber(int[] nums) {
        int n;
        int max = 0;
        int[] count = new int[1001];
        for (int i : nums) {
            count[i]++;
            max = Math.max(max, i);
        }
        count[0] = 0;
        int idx = 0;
        for (int i = 1; i <= max; ++i) {
            for (int j = 0; j < count[i]; ++j, ++idx) {
                nums[idx] = i;
            }
            count[i] += count[i - 1];
        }
        n = idx;
        int r = 0;
        for (int i = 0; i < n - 2; ++i) {
            for (int j = i + 1; j < n - 1; ++j) {
                if (nums[i] + nums[j] > max) {
                    r += (n - j) * (n - j - 1) / 2;
                    break;
                }
                r += count[nums[i] + nums[j] - 1] - j - 1;
            }
        }
        return r;
    }
}
