package g2901_3000.s2976_minimum_cost_to_convert_string_i;

// #Medium #Array #String #Graph #Shortest_Path
// #2024_01_18_Time_18_ms_(92.47%)_Space_45.9_MB_(31.83%)

import java.util.Arrays;

public class Solution {
    public long minimumCost(
            String inputText,
            String desiredText,
            char[] fromLetters,
            char[] toLetters,
            int[] transformationCost) {
        int alphabetSize = 26;
        int[][] transformationMatrix = new int[alphabetSize][alphabetSize];
        for (int idx = 0; idx < alphabetSize; idx++) {
            Arrays.fill(transformationMatrix[idx], Integer.MAX_VALUE);
            transformationMatrix[idx][idx] = 0;
        }
        int i = 0;
        while (i < fromLetters.length) {
            int origChar = fromLetters[i] - 'a';
            int newChar = toLetters[i] - 'a';
            int changeCost = transformationCost[i];
            transformationMatrix[origChar][newChar] =
                    Math.min(transformationMatrix[origChar][newChar], changeCost);
            i++;
        }
        int k = 0;
        do {
            for (int row = 0; row < alphabetSize; row++) {
                for (int col = 0; col < alphabetSize; col++) {
                    if (transformationMatrix[row][k] != Integer.MAX_VALUE
                            && transformationMatrix[k][col] != Integer.MAX_VALUE) {
                        transformationMatrix[row][col] =
                                Math.min(
                                        transformationMatrix[row][col],
                                        transformationMatrix[row][k]
                                                + transformationMatrix[k][col]);
                    }
                }
            }
            k++;
        } while (k < alphabetSize);
        long totalCost = 0;
        for (int pos = 0; pos < inputText.length(); pos++) {
            int startChar = inputText.charAt(pos) - 'a';
            int endChar = desiredText.charAt(pos) - 'a';
            if (startChar == endChar) {
                continue;
            }
            if (transformationMatrix[startChar][endChar] == Integer.MAX_VALUE) {
                return -1;
            } else {
                totalCost += transformationMatrix[startChar][endChar];
            }
        }
        return totalCost;
    }
}
