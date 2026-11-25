package g4001_4100.s4036_lexicographically_largest_string_after_pair_transformations;

// #Medium #Array #String #Greedy #Bit_Manipulation #Staff #Biweekly_Contest_190
// #2026_11_25_Time_46_ms_(99.50%)_Space_130.17_MB_(98.51%)

public class Solution {
    public String[] largestString(int[] nums) {
        int n = nums.length;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int mask = num & 0b1111111111111111111111111;
            int zCount = num >>> 25;
            char[] arr = new char[Integer.bitCount(mask) + zCount];
            for (int j = 0; j < zCount; j++) {
                arr[j] = 'z';
            }
            int index = arr.length - 1;
            char c = 'a';
            while (mask > 0) {
                if ((mask & 1) == 1) {
                    arr[index--] = c;
                }
                c++;
                mask >>>= 1;
            }
            ans[i] = String.valueOf(arr);
        }
        return ans;
    }
}
