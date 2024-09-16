package g3201_3300.s3289_the_two_sneaky_numbers_of_digitville;

// #Easy #2024_09_16_Time_3_ms_(100.00%)_Space_45_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        // Populate the HashMap with the frequency of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        // Array to store the result
        int[] result = new int[2];
        int index = 0;
        // Find the numbers that appear exactly twice
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 2) {
                result[index++] = entry.getKey();
                // Break if we have found both sneaky numbers
                if (index == 2) {
                    break;
                }
            }
        }
        return result;
    }
}
