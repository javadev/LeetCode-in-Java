package g2201_2300.s2207_maximize_number_of_subsequences_in_a_string;

// #Medium #String #Greedy #Prefix_Sum #2022_06_12_Time_15_ms_(91.40%)_Space_54.4_MB_(39.82%)

public class Solution {
    public long maximumSubsequenceCount(String text, String pat) {
        int count1 = 0;
        int count2 = 0;
        long subs = 0;
        char c1 = pat.charAt(0);
        char c2 = pat.charAt(1);
        for (char c : text.toCharArray()) {
            if (c == c1) {
                count1++;
            }

            if (c == c2) {
                count2++;
                subs += (c1 == c2 ? count1 - 1 : count1);
            }
        }

        return subs + Math.max(count1, count2);
    }
}
