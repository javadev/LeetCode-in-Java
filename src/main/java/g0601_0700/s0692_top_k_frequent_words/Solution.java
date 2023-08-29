package g0601_0700.s0692_top_k_frequent_words;

// #Medium #String #Hash_Table #Sorting #Heap_Priority_Queue #Counting #Trie #Bucket_Sort
// #Level_1_Day_15_Heap #2022_03_22_Time_11_ms_(38.54%)_Space_45.1_MB_(53.98%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    /*
     * O(n) extra space
     * O(nlogk) time
     */
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        SortedSet<Map.Entry<String, Integer>> sortedset =
                new TreeSet<>(
                        (e1, e2) -> {
                            if (e1.getValue().intValue() != e2.getValue().intValue()) {
                                return e2.getValue() - e1.getValue();
                            } else {
                                return e1.getKey().compareToIgnoreCase(e2.getKey());
                            }
                        });
        sortedset.addAll(map.entrySet());
        List<String> result = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> iterator = sortedset.iterator();
        while (iterator.hasNext() && k-- > 0) {
            result.add(iterator.next().getKey());
        }
        return result;
    }
}
