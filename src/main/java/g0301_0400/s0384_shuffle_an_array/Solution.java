package g0301_0400.s0384_shuffle_an_array;

// #Medium #Top_Interview_Questions #Array #Math #Randomized

import java.security.SecureRandom;

public class Solution {
    private int[] arr;
    private SecureRandom ran;

    public Solution(int[] nums) {
        arr = nums;
        ran = new SecureRandom();
    }

    public int[] reset() {
        return arr;
    }

    public int[] shuffle() {
        int[] random = arr.clone();
        for (int i = random.length - 1; i > 0; i--) {
            int rand = ran.nextInt(i + 1);
            int temp = random[i];
            random[i] = random[rand];
            random[rand] = temp;
        }
        return random;
    }
}
