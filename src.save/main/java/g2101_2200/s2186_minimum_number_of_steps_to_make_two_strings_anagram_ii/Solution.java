package g2101_2200.s2186_minimum_number_of_steps_to_make_two_strings_anagram_ii;

// #Medium #String #Hash_Table #Counting #2022_06_08_Time_22_ms_(77.11%)_Space_70.1_MB_(39.92%)

public class Solution {
    public int minSteps(String s, String t) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            a[t.charAt(i) - 'a']--;
        }
        int sum = 0;
        for (int j : a) {
            sum += Math.abs(j);
        }
        return sum;
    }
}
