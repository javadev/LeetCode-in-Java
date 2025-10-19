package g3701_3800.s3720_lexicographically_smallest_permutation_greater_than_target;

// #Medium #Weekly_Contest_472 #2025_10_19_Time_38_ms_(_%)_Space_46.56_MB_(_%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        Map<Character, Integer> sCounts = new HashMap<>();
        for (char c : s.toCharArray()) {
            sCounts.put(c, sCounts.getOrDefault(c, 0) + 1);
        }
        String bestSolution = "";
        Map<Character, Integer> prefixCounts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // Create a copy of counts available for suffix and pivot
            Map<Character, Integer> availableCounts = new HashMap<>(sCounts);
            for (Map.Entry<Character, Integer> entry : prefixCounts.entrySet()) {
                availableCounts.put(
                        entry.getKey(),
                        availableCounts.getOrDefault(entry.getKey(), 0) - entry.getValue());
            }
            // Find the smallest char > target[i] to use as the pivot
            for (char pivotChar = (char) (target.charAt(i) + 1); pivotChar <= 'z'; pivotChar++) {
                if (availableCounts.getOrDefault(pivotChar, 0) > 0) {
                    // We found a valid pivot character
                    availableCounts.put(pivotChar, availableCounts.get(pivotChar) - 1);
                    String currentPrefix = target.substring(0, i);
                    // Build the smallest possible suffix from remaining characters
                    StringBuilder suffix = new StringBuilder();
                    for (char k = 'a'; k <= 'z'; k++) {
                        if (availableCounts.getOrDefault(k, 0) > 0) {
                            int count = availableCounts.get(k);
                            suffix.append(String.valueOf(k).repeat(Math.max(0, count)));
                        }
                    }
                    String candidate = currentPrefix + pivotChar + suffix;
                    if (bestSolution.isEmpty() || candidate.compareTo(bestSolution) < 0) {
                        bestSolution = candidate;
                    }
                    // Since we want the smallest pivotChar, we break after finding one
                    break;
                }
            }
            // Update prefix_counts for the next iteration
            char targetChar = target.charAt(i);
            prefixCounts.put(targetChar, prefixCounts.getOrDefault(targetChar, 0) + 1);
            if (prefixCounts.get(targetChar) > sCounts.getOrDefault(targetChar, 0)) {
                // We can't match the target's prefix any further, so stop.
                break;
            }
        }
        return bestSolution;
    }
}
