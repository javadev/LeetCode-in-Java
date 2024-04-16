package g3001_3100.s3079_find_the_sum_of_encrypted_integers;

// #Easy #Array #Math #2024_04_16_Time_1_ms_(99.95%)_Space_42.7_MB_(75.97%)

public class Solution {
    private int encrypt(int x) {
        int nDigits = 0;
        int max = 0;
        while (x > 0) {
            max = Math.max(max, x % 10);
            x /= 10;
            nDigits++;
        }
        int ans = 0;
        for (int i = 0; i < nDigits; i++) {
            ans = ans * 10 + max;
        }
        return ans;
    }

    public int sumOfEncryptedInt(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret += encrypt(num);
        }
        return ret;
    }
}
