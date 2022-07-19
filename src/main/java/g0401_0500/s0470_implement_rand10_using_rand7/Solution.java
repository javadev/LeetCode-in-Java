package g0401_0500.s0470_implement_rand10_using_rand7;

// #Medium #Math #Randomized #Probability_and_Statistics #Rejection_Sampling
// #2022_07_19_Time_8_ms_(82.15%)_Space_50.7_MB_(31.69%)

import java.util.Random;

@SuppressWarnings("java:S2245")
public class Solution {
    private final Random random = new Random();

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
        return random.nextInt(7) + 1;
    }
}
