package g1301_1400.s1313_decompress_run_length_encoded_list;

// #Easy #Array #2022_06_20_Time_1_ms_(98.11%)_Space_42.5_MB_(98.11%)

public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
        int[] ans = new int[len];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int j = nums[i];
            while (j > 0) {
                ans[index] = nums[i + 1];
                index++;
                j--;
            }
        }
        return ans;
    }
}
