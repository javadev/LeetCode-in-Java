package g1201_1300.s1248_count_number_of_nice_subarrays;

// #Medium #Array #Hash_Table #Math #Sliding_Window
// #2022_03_12_Time_14_ms_(69.78%)_Space_74.9_MB_(51.91%)

public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddLen = 0;
        int startIndex = 0;
        int num = 0;
        int endIndex;
        int res = 0;
        boolean hasK;
        for (int i = 0; i < nums.length; i++) {
            hasK = false;
            endIndex = i;
            if (nums[i] % 2 == 1) {
                oddLen++;
            }
            while (oddLen >= k) {
                hasK = true;
                if (nums[startIndex++] % 2 == 1) {
                    oddLen--;
                }
                num++;
            }
            res += num;
            while (hasK && ++endIndex < nums.length && nums[endIndex] % 2 == 0) {
                res += num;
            }
            num = 0;
        }
        return res;
    }
}
