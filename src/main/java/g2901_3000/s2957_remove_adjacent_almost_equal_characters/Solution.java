package g2901_3000.s2957_remove_adjacent_almost_equal_characters;

// #Medium #String #Dynamic_Programming #Greedy
// #2024_01_15_Time_1_ms_(100.00%)_Space_42.1_MB_(15.57%)

public class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int count = 0;
        char[] wordArray = word.toCharArray();
        for (int i = 1; i < wordArray.length; i++) {
            if (Math.abs(wordArray[i] - wordArray[i - 1]) <= 1) {
                count++;
                wordArray[i] =
                        (i + 1 < wordArray.length
                                        && (wordArray[i + 1] != 'a' && wordArray[i + 1] != 'b'))
                                ? 'a'
                                : 'z';
            }
        }
        return count;
    }
}
