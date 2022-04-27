package g0301_0400.s0384_shuffle_an_array;

// #Medium #Top_Interview_Questions #Array #Math #Randomized #Algorithm_II_Day_20_Others
// #2022_03_18_Time_65_ms_(94.59%)_Space_50.3_MB_(91.27%)

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
