package g2201_2300.s2207_maximize_number_of_subsequences_in_a_string;

// #Medium #String #Greedy #Prefix_Sum #2022_06_11_Time_8_ms_(100%)_Space_43.1_MB(81.70%)

public class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        char first = pattern.charAt(0);
        char second = pattern.charAt(1);
        if (first == second) {
            long res = 0;
            for (char c : text.toCharArray()) {
                if (c == first) {
                    res++;
                }
            }
            return (res * (res + 1)) / 2;
        }
        long res = 0;
        int firstCount = 0;
        int secondCount = 0;
        for (char c : text.toCharArray()) {
            if (c == first) {
                firstCount++;
            } else if (c == second) {
                secondCount++;
                res += firstCount;
            }
        }
        return Math.max(res + secondCount, res + firstCount);
    }
}
