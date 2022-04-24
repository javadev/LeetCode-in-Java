package g1701_1800.s1704_determine_if_string_halves_are_alike;

// #Easy #String #Counting #2022_04_24_Time_6_ms_(42.11%)_Space_40.4_MB_(91.25%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels =
                new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int firstHalfVowelsCount =
                (int)
                        IntStream.range(0, s.length() / 2)
                                .filter(i -> vowels.contains(s.charAt(i)))
                                .count();
        int secondHalfVowelsCount =
                (int)
                        IntStream.range(s.length() / 2, s.length())
                                .filter(i -> vowels.contains(s.charAt(i)))
                                .count();
        return firstHalfVowelsCount == secondHalfVowelsCount;
    }
}
