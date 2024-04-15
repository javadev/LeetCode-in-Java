package g0301_0400.s0384_shuffle_an_array;

// #Medium #Array #Math #Randomized #Algorithm_II_Day_20_Others
// #2022_07_13_Time_52_ms_(91.77%)_Space_48.2_MB_(92.20%)

import java.util.Random;

@SuppressWarnings("java:S2245")
public class Solution {
    private int[] nums;
    private Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    // Resets the array to its original configuration and return it.
    public int[] reset() {
        return this.nums;
    }

    // Returns a random shuffling of the array.
    public int[] shuffle() {
        int[] shuffled = this.nums.clone();
        for (int i = nums.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            swap(shuffled, i, j);
        }
        return shuffled;
    }

    private void swap(int[] shuffled, int i, int j) {
        int tmp = shuffled[i];
        shuffled[i] = shuffled[j];
        shuffled[j] = tmp;
    }
}
