package g0201_0300.s0242_valid_anagram_easy_top_interview_questions_string_hash_table_sorting;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charFreqMap = new int[26];
        for (char c : s.toCharArray()) {
            charFreqMap[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (charFreqMap[c - 'a'] == 0) {
                return false;
            }
            charFreqMap[c - 'a']--;
        }
        return true;
    }
}
