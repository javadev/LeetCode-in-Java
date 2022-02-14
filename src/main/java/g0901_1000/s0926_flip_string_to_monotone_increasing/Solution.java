package g0901_1000.s0926_flip_string_to_monotone_increasing;

class Solution {
    public int minFlipsMonoIncr(String s) {
        if (s == null || s.length() <= 1) return 0;
        final int N = s.length();
        int countOnes = 0, countFlips = 0;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '0') {
                if (countOnes == 0) continue;
                else countFlips++;
            } else {
                countOnes++;
            }
            countFlips = Math.min(countFlips, countOnes);
        }
        return countFlips;
    }
}
