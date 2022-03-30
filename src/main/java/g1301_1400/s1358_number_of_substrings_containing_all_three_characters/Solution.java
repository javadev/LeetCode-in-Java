package g1301_1400.s1358_number_of_substrings_containing_all_three_characters;

// #Medium #String #Hash_Table #Sliding_Window
// #2022_03_21_Time_15_ms_(53.82%)_Space_44.9_MB_(64.12%)

public class Solution {
    public int numberOfSubstrings(String s) {
        int[] counts = new int[3];
        int i = 0;
        int n = s.length();
        int result = 0;
        for (int j = 0; j < n; j++) {
            counts[s.charAt(j) - 'a']++;
            while (counts[0] > 0 && counts[1] > 0 && counts[2] > 0) {
                counts[s.charAt(i++) - 'a']--;
            }
            result += i;
        }
        return result;
    }
}
