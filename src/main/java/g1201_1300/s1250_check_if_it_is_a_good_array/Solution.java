package g1201_1300.s1250_check_if_it_is_a_good_array;

// #Hard #Array #Math #Number_Theory #2022_03_12_Time_4_ms_(58.82%)_Space_60.8_MB_(5.43%)

public class Solution {
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public boolean isGoodArray(int[] nums) {
        int ans = nums[0];
        for (int element : nums) {
            ans = gcd(ans, element);
            if (ans == 1) {
                return true;
            }
        }
        return false;
    }
}
