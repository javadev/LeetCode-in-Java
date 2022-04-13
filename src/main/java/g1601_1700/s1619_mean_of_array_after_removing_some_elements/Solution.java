package g1601_1700.s1619_mean_of_array_after_removing_some_elements;

// #Easy #Array #Sorting #2022_04_13_Time_2_ms_(99.81%)_Space_41.8_MB_(91.95%)

import java.util.Arrays;

public class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        long sum = 0;
        for (int i = (int) Math.round(n * 0.05); i < (n - n * 0.05); i++) {
            sum += arr[i];
        }
        return sum / (n - n * 0.1);
    }
}
