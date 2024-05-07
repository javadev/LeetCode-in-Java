package g3101_3200.s3138_minimum_length_of_anagram_concatenation;

// #Medium #String #Hash_Table #Counting #2024_05_07_Time_4_ms_(84.18%)_Space_45.3_MB_(81.03%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int minAnagramLength(String s) {
        int n = s.length();
        int[] sq = new int[n];
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (i == 0) {
                sq[i] = ch * ch;
            } else {
                sq[i] = sq[i - 1] + ch * ch;
            }
        }
        List<Integer> factors = getAllFactorsVer2(n);
        Collections.sort(factors);
        for (int j = 0; j < factors.size(); j++) {
            int factor = factors.get(j);
            if (factor == 1) {
                if (sq[0] * n == sq[n - 1]) return 1;
            } else {
                int sum = sq[factor - 1];
                int start = 0;
                for (int i = factor - 1; i < n; i += factor) {
                    if (start + sum != sq[i]) break;
                    start += sum;
                    if (i == n - 1) return factor;
                }
            }
        }
        return n - 1;
    }

    private List<Integer> getAllFactorsVer2(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                factors.add(n / i);
            }
        }
        return factors;
    }
}
