package g1601_1700.s1668_maximum_repeating_substring;

// #Easy #String #String_Matching #2022_04_22_Time_1_ms_(93.15%)_Space_40.5_MB_(86.13%)

public class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        StringBuilder repeat = new StringBuilder(word);
        while (sequence.contains(repeat)) {
            k++;
            repeat.append(word);
        }
        return k;
    }
}
