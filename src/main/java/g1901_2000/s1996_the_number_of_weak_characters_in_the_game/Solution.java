package g1901_2000.s1996_the_number_of_weak_characters_in_the_game;

// #Medium #Array #Sorting #Greedy #Stack #Monotonic_Stack
// #2022_05_16_Time_113_ms_(90.91%)_Space_89.7_MB_(76.18%)

import java.util.Arrays;

public class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        // sorting according to decreasing attacking power
        Arrays.sort(properties, (a, b) -> b[0] - a[0]);
        int max = 0;
        int temp;
        int n = properties.length;
        int count = 0;
        int i = 0;
        while (i < n) {
            temp = properties[i][1];
            if (properties[i][1] < max) {
                count++;
            }
            // If many characters are having same attack then max defence seen wont be updated till
            // we complete all characters with same attack
            while (i < n - 1 && properties[i + 1][0] == properties[i][0]) {
                i++;
                if (properties[i][1] < max) {
                    count++;
                }
                temp = Math.max(temp, properties[i][1]);
            }
            // updating max defence seen for characters with lesser attack power
            max = Math.max(max, temp);
            i++;
        }
        return count;
    }
}
