package g0401_0500.s0470_implement_rand10_using_rand7;

// #Medium #Math #Randomized #Probability_and_Statistics #Rejection_Sampling

import java.security.SecureRandom;

public class Solution {
    private final SecureRandom secureRandom = new SecureRandom();

    public int rand10() {
        int num = (rand7() - 1) * 7 + rand7();
        if (num <= 40) {
            return (num % 10) + 1;
        }
        num = num - 40;
        num = (rand7() - 1) * 9 + num;
        if (num <= 60) {
            return (num % 10) + 1;
        }
        num = num - 60;
        int res;
        do {
            res = (rand7() + 1) * 3 + num;
        } while (res <= 20);
        return (res % 10) + 1;
    }

    private int rand7() {
        return secureRandom.nextInt(7) + 1;
    }
}
