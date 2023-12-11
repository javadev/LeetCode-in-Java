package g0901_1000.s0926_flip_string_to_monotone_increasing;

// #Medium #String #Dynamic_Programming #2022_03_29_Time_12_ms_(63.41%)_Space_50.7_MB_(48.55%)

public class Solution {
    public int minFlipsMonoIncr(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        final int n = s.length();
        int countOnes = 0;
        int countFlips = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (countOnes == 0) {
                    continue;
                } else {
                    countFlips++;
                }
            } else {
                countOnes++;
            }
            countFlips = Math.min(countFlips, countOnes);
        }
        return countFlips;
    }
}
