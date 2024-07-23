package g3201_3300.s3223_minimum_length_of_string_after_operations;

// #Medium #String #Hash_Table #Counting #2024_07_23_Time_9_ms_(94.23%)_Space_46.5_MB_(38.50%)

public class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int c = 0;
        for (int i : freq) {
            if (i != 0) {
                if (i % 2 == 0) {
                    c += 2;
                } else {
                    c += 1;
                }
            }
        }
        return c;
    }
}
