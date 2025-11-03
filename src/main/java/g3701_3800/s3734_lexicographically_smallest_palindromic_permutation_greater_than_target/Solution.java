package g3701_3800.s3734_lexicographically_smallest_palindromic_permutation_greater_than_target;

// #Hard #Weekly_Contest_474 #2025_11_02_Time_3_ms_(50.00%)_Space_46.55_MB_(_%)

import java.util.Arrays;

public class Solution {
    boolean func(int i, String target, char[] ans, int l, int r, int[] freq, boolean end) {
        if (l > r) {
            return new String(ans).compareTo(target) > 0;
        }
        if (l == r) {
            char left = '#';
            for (int k = 0; k < 26; k++) {
                if (freq[k] > 0) {
                    left = (char) (k + 'a');
                }
            }
            freq[left - 'a']--;
            ans[l] = left;
            if (func(i + 1, target, ans, l + 1, r - 1, freq, end)) {
                return true;
            }
            freq[left - 'a']++;
            ans[l] = '#';
            return false;
        }
        if (end) {
            for (int j = 0; j < 26; j++) {
                if (freq[j] > 1) {
                    freq[j] -= 2;
                    ans[l] = ans[r] = (char) (j + 'a');
                    if (func(i + 1, target, ans, l + 1, r - 1, freq, end)) {
                        return true;
                    }
                    ans[l] = ans[r] = '#';
                    freq[j] += 2;
                }
            }
            return false;
        }
        char curr = target.charAt(i);
        char next = '1';
        for (int k = target.charAt(i) - 'a' + 1; k < 26; k++) {
            if (freq[k] > 1) {
                next = (char) (k + 'a');
                break;
            }
        }
        if (freq[curr - 'a'] > 1) {
            ans[l] = ans[r] = curr;
            freq[curr - 'a'] -= 2;
            if (func(i + 1, target, ans, l + 1, r - 1, freq, end)) {
                return true;
            }
            freq[curr - 'a'] += 2;
        }
        if (next != '1') {
            ans[l] = ans[r] = next;
            freq[next - 'a'] -= 2;
            if (func(i + 1, target, ans, l + 1, r - 1, freq, true)) {
                return true;
            }
        }
        ans[l] = ans[r] = '#';
        return false;
    }

    public String lexPalindromicPermutation(String s, String target) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int oddc = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                oddc++;
            }
        }
        if (oddc > 1) {
            return "";
        }
        char[] ans = new char[s.length()];
        Arrays.fill(ans, '#');
        if (func(0, target, ans, 0, s.length() - 1, freq, false)) {
            return new String(ans);
        }
        return "";
    }
}
