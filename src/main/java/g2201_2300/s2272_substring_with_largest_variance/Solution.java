package g2201_2300.s2272_substring_with_largest_variance;

// #Hard #Array #Dynamic_Programming #2022_06_16_Time_469_ms_(23.66%)_Space_43.7_MB_(32.44%)

public class Solution {
    public int largestVariance(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int maxVariance = 0;
        for (int a = 0; a < 26; a++) {
            for (int b = 0; b < 26; b++) {
                int remainingA = freq[a];
                int remainingB = freq[b];
                if (a == b || remainingA == 0 || remainingB == 0) {
                    continue;
                }
                int currBFreq = 0;
                int currAFreq = 0;
                for (int i = 0; i < s.length(); i++) {
                    int c = s.charAt(i) - 'a';
                    if (c == b) {
                        currBFreq++;
                    }
                    if (c == a) {
                        currAFreq++;
                        remainingA--;
                    }

                    if (currAFreq > 0) {
                        maxVariance = Math.max(maxVariance, currBFreq - currAFreq);
                    }
                    if (currBFreq < currAFreq && remainingA >= 1) {
                        currBFreq = 0;
                        currAFreq = 0;
                    }
                }
            }
        }
        return maxVariance;
    }
}
