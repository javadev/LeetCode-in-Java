package g3701_3800.s3766_minimum_operations_to_make_binary_palindrome;

// #Medium #Array #Binary_Search #Two_Pointers #Bit_Manipulation #Staff #Biweekly_Contest_171
// #2026_05_08_Time_54_ms_(82.69%)_Space_47.43_MB_(64.42%)

public class Solution {
    private int binlen(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n >>= 1;
        }
        return c;
    }

    private boolean isPal(int n) {
        int l = 0;
        int r = binlen(n) - 1;
        while (l < r) {
            if (((n >> l) & 1) != ((n >> r) & 1)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public int[] minOperations(int[] nums) {
        boolean[] binary = new boolean[5050];
        int[] ans = new int[nums.length];
        for (int i = 0; i < 5050; i++) {
            binary[i] = isPal(i);
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = nums[i];
            int c1 = 0;
            int c2 = 0;
            while (!binary[a]) {
                a--;
                c1++;
            }
            while (!binary[b]) {
                b++;
                c2++;
            }
            ans[i] = Math.min(c1, c2);
        }
        return ans;
    }
}
