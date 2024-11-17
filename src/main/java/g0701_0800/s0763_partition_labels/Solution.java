package g0701_0800.s0763_partition_labels;

// #Medium #String #Hash_Table #Greedy #Two_Pointers #Data_Structure_II_Day_7_String
// #Big_O_Time_O(n)_Space_O(1) #2024_11_17_Time_2_ms_(100.00%)_Space_41.9_MB_(73.06%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> partitionLabels(String s) {
        char[] letters = s.toCharArray();
        List<Integer> result = new ArrayList<>();
        int[] position = new int[26];
        for (int i = 0; i < letters.length; i++) {
            position[letters[i] - 'a'] = i;
        }
        int i = 0;
        int prev = -1;
        int max = 0;
        while (i < letters.length) {
            if (position[letters[i] - 'a'] > max) {
                max = position[letters[i] - 'a'];
            }
            if (i == max) {
                result.add(i - prev);
                prev = i;
            }
            i++;
        }
        return result;
    }
}
