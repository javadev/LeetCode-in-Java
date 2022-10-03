package g1601_1700.s1688_count_of_matches_in_tournament;

// #Easy #Math #Simulation #2022_04_15_Time_0_ms_(100.00%)_Space_39.4_MB_(81.03%)

public class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                matches += n / 2;
                n /= 2;
            } else {
                matches += (n - 1) / 2;
                n = (n + 1) / 2;
            }
        }
        return matches;
    }
}
