package g3601_3700.s3663_find_the_least_frequent_digit;

// #Easy #Biweekly_Contest_164 #2025_08_31_Time_4_ms_(100.00%)_Space_41.21_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int getLeastFrequentDigit(int n) {
        String s = String.valueOf(n);
        int k = s.length();
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int digit = s.charAt(i) - '0';
            freq.put(digit, freq.getOrDefault(digit, 0) + 1);
        }
        int minfreq = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> it : freq.entrySet()) {
            minfreq = Math.min(minfreq, it.getValue());
        }
        int result = 10;
        for (Map.Entry<Integer, Integer> it : freq.entrySet()) {
            if (it.getValue() == minfreq) {
                result = Math.min(result, it.getKey());
            }
        }
        return result;
    }
}
