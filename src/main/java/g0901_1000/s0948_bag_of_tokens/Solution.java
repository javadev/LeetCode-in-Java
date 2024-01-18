package g0901_1000.s0948_bag_of_tokens;

// #Medium #Array #Sorting #Greedy #Two_Pointers
// #2022_12_26_Time_2_ms_(100.00%)_Space_42_MB_(85.95%)

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
