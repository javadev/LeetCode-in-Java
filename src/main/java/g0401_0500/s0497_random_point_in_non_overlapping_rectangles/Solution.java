package g0401_0500.s0497_random_point_in_non_overlapping_rectangles;

// #Medium #Math #Binary_Search #Prefix_Sum #Ordered_Set #Randomized #Reservoir_Sampling

import java.security.SecureRandom;

public class Solution {
    private final int[] weights;
    private final int[][] rects;
    private final SecureRandom random;

    public Solution(int[][] rects) {
        this.weights = new int[rects.length];
        this.rects = rects;
        this.random = new SecureRandom();
        for (int i = 0; i < rects.length; i++) {
            int[] rect = rects[i];
            int count = (1 + rect[2] - rect[0]) * (1 + rect[3] - rect[1]);
            weights[i] = (i == 0 ? 0 : weights[i - 1]) + count;
        }
    }

    public int[] pick() {
        int picked = 1 + random.nextInt(weights[weights.length - 1]);
        int idx = findGreaterOrEqual(picked);
        return getRandomPoint(idx);
    }

    private int findGreaterOrEqual(int target) {
        int left = 0;
        int right = weights.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (weights[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return weights[left] >= target ? left : right;
    }

    private int[] getRandomPoint(int idx) {
        int[] r = rects[idx];
        int left = r[0];
        int right = r[2];
        int bot = r[1];
        int top = r[3];
        return new int[] {
            left + random.nextInt(right - left + 1), bot + random.nextInt(top - bot + 1)
        };
    }
}
