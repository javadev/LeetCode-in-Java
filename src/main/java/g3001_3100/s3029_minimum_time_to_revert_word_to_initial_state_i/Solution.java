package g3001_3100.s3029_minimum_time_to_revert_word_to_initial_state_i;

// #Medium #String #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_01_Time_1_ms_(99.70%)_Space_42.7_MB_(8.42%)

public class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        for (int i = k; i < n; i += k) {
            if (word.substring(i, n).equals(word.substring(0, n - i))) {
                return i / k;
            }
        }
        return (n + k - 1) / k;
    }
}
