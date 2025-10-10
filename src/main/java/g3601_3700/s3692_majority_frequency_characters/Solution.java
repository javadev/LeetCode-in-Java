package g3601_3700.s3692_majority_frequency_characters;

// #Easy #String #Hash_Table #Counting #Biweekly_Contest_166
// #2025_10_07_Time_1_ms_(100.00%)_Space_42.89_MB_(97.01%)

public class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] cntArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cntArray[s.charAt(i) - 'a']++;
        }
        int[] freq = new int[s.length() + 1];
        for (int i = 0; i < 26; i++) {
            if (cntArray[i] > 0) {
                freq[cntArray[i]]++;
            }
        }
        int size = 0;
        int bfreq = 0;
        for (int i = 0; i <= s.length(); i++) {
            int si = freq[i];
            if (si > size || (si == size && i > bfreq)) {
                size = si;
                bfreq = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (cntArray[i] == bfreq) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }
}
