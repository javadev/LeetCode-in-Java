package g2001_2100.s2042_check_if_numbers_are_ascending_in_a_sentence;

// #Easy #String #2022_05_26_Time_2_ms_(75.46%)_Space_42.7_MB_(29.81%)

public class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split("\\ ");
        int prev = 0;
        for (String word : words) {
            if (Character.isDigit(word.charAt(0))) {
                if (Integer.parseInt(word) <= prev) {
                    return false;
                } else {
                    prev = Integer.parseInt(word);
                }
            }
        }
        return true;
    }
}
