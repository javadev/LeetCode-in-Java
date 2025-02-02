package g3401_3500.s3442_maximum_difference_between_even_and_odd_frequency_i;

// #Easy #2025_02_02_Time_1_(100.00%)_Space_42.30_(_%)

import java.util.Arrays;

public class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        int maxOdd = 0;
        int minEven = 1000;
        for (int i = 0; i < s.length(); ++i) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int j : freq) {
            if (j != 0 && j % 2 == 0) {
                minEven = Math.min(minEven, j);
            } else {
                maxOdd = Math.max(maxOdd, j);
            }
        }
        return maxOdd - minEven;
    }
}
