package g1101_1200.s1189_maximum_number_of_balloons;

// #Easy #String #Hash_Table #Counting #2022_03_03_Time_3_ms_(68.13%)_Space_41.5_MB_(50.00%)

public class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[26];
        for (char c : text.toCharArray()) {
            counts[c - 'a']++;
        }
        return Math.min(
                counts[0],
                Math.min(
                        counts[1], Math.min(counts[11] / 2, Math.min(counts[14] / 2, counts[13]))));
    }
}
