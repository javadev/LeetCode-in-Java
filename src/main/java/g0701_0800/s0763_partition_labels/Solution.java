package g0701_0800.s0763_partition_labels;

// #Medium #Top_100_Liked_Questions #String #Hash_Table #Greedy #Two_Pointers

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
        for (int i = 0, prev = -1, max = 0; i < letters.length; i++) {
            if (position[letters[i] - 'a'] > max) {
                max = position[letters[i] - 'a'];
            }
            if (i == max) {
                result.add(i - prev);
                prev = i;
            }
        }
        return result;
    }
}
