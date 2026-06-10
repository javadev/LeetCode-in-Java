package g3801_3900.s3816_lexicographically_smallest_string_after_deleting_duplicate_characters;

// #Hard #String #Hash_Table #Greedy #Stack #Monotonic_Stack #Senior_Staff #Weekly_Contest_485
// #2026_06_09_Time_65_ms_(91.61%)_Space_47.86_MB_(91.61%)

public class Solution {
    public String lexSmallestAfterDeletion(String s) {
        char[] a = s.toCharArray();
        int[] rem = new int[26];
        for (char c : a) {
            rem[c - 'a']++;
        }
        int[] cnt = new int[26];
        StringBuilder sb = new StringBuilder();
        for (char c : a) {
            rem[c - 'a']--;
            while (!sb.isEmpty()) {
                char t = sb.charAt(sb.length() - 1);
                if (t > c && (rem[t - 'a'] > 0 || cnt[t - 'a'] > 1)) {
                    cnt[t - 'a']--;
                    sb.setLength(sb.length() - 1);
                } else {
                    break;
                }
            }
            sb.append(c);
            cnt[c - 'a']++;
        }
        while (!sb.isEmpty()) {
            int i = sb.length() - 1;
            char c = sb.charAt(i);
            if (cnt[c - 'a'] > 1) {
                cnt[c - 'a']--;
                sb.setLength(i);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
