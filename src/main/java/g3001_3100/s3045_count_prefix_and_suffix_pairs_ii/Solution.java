package g3001_3100.s3045_count_prefix_and_suffix_pairs_ii;

// #Hard #Array #String #Trie #Hash_Function #String_Matching #Rolling_Hash
// #2024_02_29_Time_19_ms_(100.00%)_Space_55.7_MB_(94.24%)

public class Solution {
    public long countPrefixSuffixPairs(String[] words) {
        long ans = 0;
        boolean[] visited = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            String p = words[i];
            if (!visited[i]) {
                int found = 1;
                for (int j = i + 1; j < words.length; j++) {
                    String s = words[j];
                    if (s.length() >= p.length() && s.startsWith(p) && s.endsWith(p)) {
                        ans += found;
                    }
                    if (p.equals(s)) {
                        found++;
                        visited[j] = true;
                    }
                }
            }
        }
        return ans;
    }
}
