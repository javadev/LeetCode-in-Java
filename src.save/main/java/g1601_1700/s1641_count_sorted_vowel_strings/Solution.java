package g1601_1700.s1641_count_sorted_vowel_strings;

// #Medium #Dynamic_Programming #2022_04_21_Time_0_ms_(100.00%)_Space_39.4_MB_(77.11%)

import java.util.Arrays;

public class Solution {
    public int countVowelStrings(int n) {
        if (n == 1) {
            return 5;
        }
        int[] arr = new int[] {1, 1, 1, 1, 1};
        int sum = 5;
        for (int i = 2; i <= n; i++) {
            int[] copy = new int[5];
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    copy[j] = sum;
                } else {
                    copy[j] = copy[j - 1] - arr[j - 1];
                }
            }
            arr = Arrays.copyOf(copy, 5);
            sum = 0;
            for (int k : arr) {
                sum += k;
            }
        }
        return sum;
    }
}
