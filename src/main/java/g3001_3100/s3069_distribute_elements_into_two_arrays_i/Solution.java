package g3001_3100.s3069_distribute_elements_into_two_arrays_i;

// #Easy #Array #Simulation #2024_03_31_Time_0_ms_(100.00%)_Space_44.6_MB_(70.15%)

public class Solution {
    public int[] resultArray(int[] nums) {
        int s = 0;
        int t = 1;
        for (int i = 2; i < nums.length; i++) {
            int p = i;
            if (nums[s] > nums[t]) {
                for (int q = s + 1; q < i; q++) {
                    int temp = nums[p];
                    nums[p] = nums[p - 1];
                    nums[p - 1] = temp;
                    p = p - 1;
                }
                s++;
                t++;
            } else {
                for (int q = t + 1; q < i; q++) {
                    int temp = nums[p];
                    nums[p] = nums[p - 1];
                    nums[p - 1] = temp;
                    p = p - 1;
                }
                t++;
            }
        }
        return nums;
    }
}
