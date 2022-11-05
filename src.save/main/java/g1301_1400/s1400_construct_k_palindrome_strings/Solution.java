package g1301_1400.s1400_construct_k_palindrome_strings;

// #Medium #String #Hash_Table #Greedy #Counting
// #2022_03_12_Time_5_ms_(94.62%)_Space_53.8_MB_(27.48%)

public class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() == k) {
            // if size is same as k we can separate out all letters
            return true;
        }
        if (s.length() < k) {
            // if size is less than it is not possible
            return false;
        }
        // count occurrence of each letter
        int[] count = new int[26];
        for (char curr : s.toCharArray()) {
            count[curr - 'a']++;
        }
        // reduce k whenever count is odd
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                k--;
            }
        }
        // we can have max k odd characters
        return k >= 0;
    }
}
