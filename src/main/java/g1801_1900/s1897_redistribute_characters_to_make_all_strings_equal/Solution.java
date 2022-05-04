package g1801_1900.s1897_redistribute_characters_to_make_all_strings_equal;

// #Easy #String #Hash_Table #Counting #2022_05_04_Time_2_ms_(100.00%)_Space_41.7_MB_(91.90%)

public class Solution {
    public boolean makeEqual(String[] words) {
        int[] charFreq = new int[26];
        for (String word : words) {
            for (int chIndex = 0; chIndex < word.length(); chIndex++) {
                charFreq[word.charAt(chIndex) - 'a']++;
            }
        }
        for (int freq : charFreq) {
            if (freq % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
