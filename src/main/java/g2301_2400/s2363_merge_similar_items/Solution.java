package g2301_2400.s2363_merge_similar_items;

// #Easy #Array #Hash_Table #Sorting #Ordered_Set
// #2022_08_14_Time_3_ms_(100.00%)_Space_43_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] arr1, int[][] arr2) {
        int[] cache = new int[1001];
        for (int[] num : arr1) {
            cache[num[0]] += num[1];
        }
        for (int[] num : arr2) {
            cache[num[0]] += num[1];
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < cache.length; i++) {
            int weight = cache[i];
            if (weight > 0) {
                int value = i;
                result.add(Arrays.asList(value, weight));
            }
        }
        return result;
    }
}
