package g1701_1800.s1704_determine_if_string_halves_are_alike;

// #Easy #String #Counting #2022_04_24_Time_1_ms_(100.00%)_Space_41.9_MB_(69.58%)

public class Solution {
    public boolean halvesAreAlike(String s) {
        if (s.length() < 1) {
            return false;
        }
        return countVowel(0, s.length() / 2, s) == countVowel(s.length() / 2, s.length(), s);
    }

    private int countVowel(int start, int end, String s) {
        int c = 0;
        for (int i = start; i < end; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
                    || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                c++;
            }
        }
        return c;
    }
}
