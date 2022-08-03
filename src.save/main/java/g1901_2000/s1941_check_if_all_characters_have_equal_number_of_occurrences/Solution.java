package g1901_2000.s1941_check_if_all_characters_have_equal_number_of_occurrences;

// #Easy #String #Hash_Table #Counting #2022_05_18_Time_2_ms_(86.25%)_Space_42.5_MB_(51.67%)

public class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }
        int bench = 0;
        for (int i = 0; i < 26; i++) {
            if (bench == 0) {
                if (counter[i] != 0) {
                    bench = counter[i];
                }
            } else {
                if (counter[i] != 0 && counter[i] != bench) {
                    return false;
                }
            }
        }
        return true;
    }
}
