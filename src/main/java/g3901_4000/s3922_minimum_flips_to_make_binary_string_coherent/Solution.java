package g3901_4000.s3922_minimum_flips_to_make_binary_string_coherent;

// #Medium #String #Senior #Biweekly_Contest_182
// #2026_09_29_Time_4_ms_(100.00%)_Space_47.56_MB_(76.92%)

public class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int count1 = 0;
        for (char c : s.toCharArray()) {
            count1 += c - '0';
        }
        int count0 = n - count1;
        // Option 1: all 0s
        int ans = count1;
        // Option 2: all 1s
        ans = Math.min(ans, count0);
        // Option 3: exactly one 1 (at any position)
        if (count1 >= 1) {
            ans = Math.min(ans, count1 - 1);
        } else {
            ans = Math.min(ans, 1);
        }
        // Option 4: "10...01" (1 at position 0 and position n-1)
        if (n >= 2 && count1 >= 2) {
            int cost4 = count1;
            if (s.charAt(0) == '1') {
                cost4--;
            }
            if (s.charAt(n - 1) == '1') {
                cost4--;
            }
            ans = Math.min(ans, cost4);
        }
        return ans;
    }
}
