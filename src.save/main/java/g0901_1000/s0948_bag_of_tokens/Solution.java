package g0901_1000.s0948_bag_of_tokens;

// #Medium #Array #Sorting #Greedy #Two_Pointers #Acceptance_46.3%
// #2022_02_20_Time_4_ms_(32.05%)_Space_42.9_MB_(28.63%)

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int l = 0;
        int r = tokens.length - 1;

        while (l <= r) {
            if (tokens[l] <= power) {
                power -= tokens[l];
                score++;
                l++;
            } else {
                if (r - l == 0) {
                    return score;
                }
                if (score >= 1) {
                    power += tokens[r];
                    score--;
                    r--;
                } else {
                    return 0;
                }
            }
        }
        return score;
    }
}
