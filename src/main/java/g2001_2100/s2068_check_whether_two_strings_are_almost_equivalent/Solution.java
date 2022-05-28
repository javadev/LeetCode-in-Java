package g2001_2100.s2068_check_whether_two_strings_are_almost_equivalent;

// #Easy #String #Hash_Table #Counting #2022_05_28_Time_1_ms(94.83)_Space_42.7_MB(23.62%)

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            ++freq[word1.charAt(i) - 'a'];
            --freq[word2.charAt(i) - 'a'];
        }
        for (int i : freq) {
            if (Math.abs(i) > 3) {
                return false;
            }
        }
        return true;
    }
}
