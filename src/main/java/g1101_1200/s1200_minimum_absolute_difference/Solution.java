package g1101_1200.s1200_minimum_absolute_difference;

// #Easy #Array #Sorting #2022_02_27_Time_14_ms_(98.30%)_Space_52_MB_(84.02%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int min = 10000000;
        Arrays.sort(arr);
        for (int i = 0; i + 1 < arr.length; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff <= min) {
                if (diff < min) {
                    min = diff;
                    result.clear();
                }
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }
}
