package g0401_0500.s0470_implement_rand10_using_rand7;

// #Medium #Math #Randomized #Probability_and_Statistics #Rejection_Sampling

import java.security.SecureRandom;

public class Solution {
    private final SecureRandom secureRandom = new SecureRandom();

    public int rand10() {
        int x = rand7();
        int y = rand7();
        int value = (x - 1) * 7 + y;
        if (value >= 41) {
            return rand10();
        }
        return value % 10 + 1;
    }

    private int rand7() {
        return secureRandom.nextInt(7) + 1;
    }
}
