package g3001_3100.s3042_count_prefix_and_suffix_pairs_i;

// #Easy #Array #String #Trie #Hash_Function #String_Matching #Rolling_Hash
// #2024_02_29_Time_2_ms_(99.56%)_Space_42.3_MB_(49.99%)

public class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        if (m > n) {
            return false;
        }
        for (int i = 0; i < m; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        for (int i = 0; i < m; i++) {
            if (str1.charAt(i) != str2.charAt(n - m + i)) {
                return false;
            }
        }
        return true;
    }
}
