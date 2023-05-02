package g0901_1000.s0953_verifying_an_alien_dictionary;

// #Easy #Array #String #Hash_Table #Programming_Skills_I_Day_9_String
// #2022_12_26_Time_0_ms_(100.00%)_Space_40.7_MB_(94.41%)

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int[26];
        for (int i = 0; i < order.length(); i++) {
            map[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (!isSmaller(words[i], words[i + 1], map)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSmaller(String str1, String str2, int[] map) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);
        for (int i = 0; i < minLength; i++) {
            if (map[str1.charAt(i) - 'a'] > map[str2.charAt(i) - 'a']) {
                return false;
            } else if (map[str1.charAt(i) - 'a'] < map[str2.charAt(i) - 'a']) {
                return true;
            }
        }
        return len1 <= len2;
    }
}
