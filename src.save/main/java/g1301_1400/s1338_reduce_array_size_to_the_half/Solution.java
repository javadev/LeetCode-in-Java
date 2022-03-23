package g1301_1400.s1338_reduce_array_size_to_the_half;

// #Medium #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue
// #2022_03_19_Time_61_ms_(73.82%)_Space_83.5_MB_(71.31%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> freq = new ArrayList<>(map.values());
        freq.sort(Collections.reverseOrder());
        int i = 0;
        int count = 0;
        int totalLength = arr.length;
        while (totalLength > arr.length / 2) {
            totalLength -= freq.get(i);
            count++;
            i++;
        }
        return count;
    }
}
