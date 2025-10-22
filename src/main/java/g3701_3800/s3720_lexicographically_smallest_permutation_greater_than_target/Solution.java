package g3701_3800.s3720_lexicographically_smallest_permutation_greater_than_target;

// #Medium #String #Hash_Table #Greedy #Counting #Enumeration #Weekly_Contest_472
// #2025_10_22_Time_2_ms_(95.82%)_Space_43.85_MB_(60.26%)

@SuppressWarnings("java:S135")
public class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        if (dfs(0, freq, sb, target, false)) {
            return sb.toString();
        }
        return "";
    }

    private boolean dfs(int i, int[] freq, StringBuilder sb, String target, boolean check) {
        if (i == target.length()) {
            return check;
        }
        for (int j = 0; j < 26; j++) {
            if (freq[j] == 0) {
                continue;
            }
            char can = (char) ('a' + j);
            if (!check && can < target.charAt(i)) {
                continue;
            }
            freq[j]--;
            sb.append(can);
            boolean next = check || can > target.charAt(i);
            if (dfs(i + 1, freq, sb, target, next)) {
                return true;
            }
            sb.deleteCharAt(sb.length() - 1);
            freq[j]++;
        }
        return false;
    }
}
