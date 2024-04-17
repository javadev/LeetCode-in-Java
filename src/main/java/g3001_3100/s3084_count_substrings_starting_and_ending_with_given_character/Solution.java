package g3001_3100.s3084_count_substrings_starting_and_ending_with_given_character;

// #Medium #String #Math #Counting #2024_04_17_Time_1_ms_(100.00%)_Space_44.9_MB_(30.07%)

public class Solution {
    public long countSubstrings(String s, char c) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return (count * (count + 1)) / 2;
    }
}
