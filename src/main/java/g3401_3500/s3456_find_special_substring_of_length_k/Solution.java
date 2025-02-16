package g3401_3500.s3456_find_special_substring_of_length_k;

// #Easy #2025_02_16_Time_1_ms_(100.00%)_Space_42.04_MB_(100.00%)

public class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        // 🚫 If string is smaller than k, no valid substring exists
        if (s.length() < k) {
            return false;
        }
        // 🔍 Iterate through all possible substrings of length k
        for (int i = 0; i <= s.length() - k; i++) {
            // 🧮 Count consecutive identical characters
            int count = 1;
            // ✅ Check if all k characters in the substring are the same
            for (int j = i; j < i + k - 1; j++) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    // ➕ Increase count if consecutive characters are the same
                    count++;
                } else {
                    // ❌ Break if mismatch occurs
                    break;
                }
            }
            // 🔎 Ensure the substring is not part of a larger group
            if (count == k
                    && (i == 0 || s.charAt(i - 1) != s.charAt(i))
                    && (i + k == s.length() || s.charAt(i + k) != s.charAt(i))) {
                // 🎯 Found a valid special substring
                return true;
            }
        }
        // ❌ No valid substring found
        return false;
    }
}
