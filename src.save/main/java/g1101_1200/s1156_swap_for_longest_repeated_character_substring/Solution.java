package g1101_1200.s1156_swap_for_longest_repeated_character_substring;

// #Medium #String #Sliding_Window #2022_03_05_Time_22_ms_(15.79%)_Space_44.2_MB_(15.04%)

public class Solution {
    public int maxRepOpt1(String text) {
        int n = text.length();
        int[] freqTxt = new int[26];
        for (int i = 0; i < n; i++) {
            freqTxt[text.charAt(i) - 'a']++;
        }
        int ans = 0;
        int distinct = 0;
        char cMin;
        char cMax;
        int[] window = new int[26];
        int l = 0;
        int r = 0;
        while (r < n) {
            char cur = text.charAt(r);
            window[cur - 'a']++;
            cMin = minFreq(window);
            cMax = maxFreq(window);
            if (window[cur - 'a'] == 1) {
                distinct++;
            }
            while (distinct > 2
                    || (distinct == 2
                            && (window[cMin - 'a'] > 1
                                    || freqTxt[cMax - 'a'] - window[cMax - 'a'] == 0))) {
                char lft = text.charAt(l);
                window[lft - 'a']--;
                if (window[lft - 'a'] == 0) {
                    distinct--;
                }
                l++;
                cMax = maxFreq(window);
                cMin = minFreq(window);
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }

    private char minFreq(int[] cnt) {
        int min = Integer.MAX_VALUE;
        char ans = '#';
        for (char c = 'a'; c <= 'z'; c++) {
            if (cnt[c - 'a'] != 0 && cnt[c - 'a'] < min) {
                min = cnt[c - 'a'];
                ans = c;
            }
        }
        return ans;
    }

    private char maxFreq(int[] cnt) {
        int max = Integer.MIN_VALUE;
        char ans = '#';
        for (char c = 'a'; c <= 'z'; c++) {
            if (cnt[c - 'a'] != 0 && cnt[c - 'a'] > max) {
                max = cnt[c - 'a'];
                ans = c;
            }
        }
        return ans;
    }
}
