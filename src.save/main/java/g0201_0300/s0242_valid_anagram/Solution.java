package g0201_0300.s0242_valid_anagram;

// #Easy #Top_Interview_Questions #String #Hash_Table #Sorting #Data_Structure_I_Day_6_String
// #Programming_Skills_I_Day_11_Containers_and_Libraries
// #2022_03_14_Time_2_ms_(98.88%)_Space_43.7_MB_(46.51%)

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
