package g2401_2500.s2449_minimum_number_of_operations_to_make_arrays_similar;

// #Hard #Array #Sorting #Greedy #2022_12_14_Time_57_ms_(87.86%)_Space_59.7_MB_(93.46%)

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("java:S2184")
public class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        ArrayList<Integer> evenNums = new ArrayList<>();
        ArrayList<Integer> oddNums = new ArrayList<>();
        ArrayList<Integer> evenTar = new ArrayList<>();
        ArrayList<Integer> oddTar = new ArrayList<>();
        Arrays.sort(nums);
        Arrays.sort(target);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNums.add(nums[i]);
            } else {
                oddNums.add(nums[i]);
            }
            if (target[i] % 2 == 0) {
                evenTar.add(target[i]);
            } else {
                oddTar.add(target[i]);
            }
        }
        long countPositiveIteration = 0;
        long countNegativeIteration = 0;
        for (int i = 0; i < evenNums.size(); i++) {
            int num = evenNums.get(i);
            int tar = evenTar.get(i);
            long diff = (long) num - tar;
            long iteration = diff / 2;
            if (diff > 0) {
                countNegativeIteration += iteration;
            } else if (diff < 0) {
                countPositiveIteration += Math.abs(iteration);
            }
        }
        for (int i = 0; i < oddNums.size(); i++) {
            int num = oddNums.get(i);
            int tar = oddTar.get(i);
            long diff = (long) num - tar;
            long iteration = diff / 2;
            if (diff > 0) {
                countNegativeIteration += iteration;
            } else if (diff < 0) {
                countPositiveIteration += Math.abs(iteration);
            }
        }
        long totalDifference = countPositiveIteration - countNegativeIteration;
        return totalDifference == 0
                ? countPositiveIteration
                : countPositiveIteration + Math.abs(totalDifference);
    }
}
