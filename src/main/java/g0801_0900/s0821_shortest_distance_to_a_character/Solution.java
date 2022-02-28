package g0801_0900.s0821_shortest_distance_to_a_character;

// #Easy #Array #String #Two_Pointers

import java.util.Arrays;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        Arrays.fill(result, Integer.MAX_VALUE);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result[i] = 0;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (result[i] != 0) {
                int j = i - 1;
                while (j >= 0 && result[j] != 0) {
                    j--;
                }
                if (j >= 0) {
                    result[i] = i - j;
                }
                j = i + 1;
                while (j < s.length() && result[j] != 0) {
                    j++;
                }
                if (j < s.length()) {
                    result[i] = Math.min(result[i], j - i);
                }
            }
        }
        return result;
    }
}
