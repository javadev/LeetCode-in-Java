package g3801_3900.s3853_merge_close_characters;

// #Medium #String #Hash_Table #Senior #Biweekly_Contest_177
// #2026_07_27_Time_2_ms_(91.01%)_Space_44.66_MB_(52.91%)

public class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder result = new StringBuilder();
        result.ensureCapacity(s.length());
        int[] cnt = new int[26];
        for (int t = 0; t < s.length(); t++) {
            char c = s.charAt(t);
            int idx = c - 'a';
            if (cnt[idx] > 0) {
                continue;
            }

            result.append(c);
            cnt[idx]++;

            if (result.length() > k) {
                char drop = result.charAt(result.length() - k - 1);
                cnt[drop - 'a']--;
            }
        }

        return result.toString();
    }
}
