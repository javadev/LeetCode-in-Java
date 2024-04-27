package g3101_3200.s3120_count_the_number_of_special_characters_i;

// #Easy #String #Hash_Table #2024_04_27_Time_1_ms_(100.00%)_Space_41.9_MB_(92.08%)

public class Solution {
    public int numberOfSpecialChars(String word) {
        int a[] = new int[26];
        int b[] = new int[26];
        int ans = 0;
        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') a[c - 'a']++;
            else b[c - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0 && b[i] != 0) ans++;
        }
        return ans;
    }
}
