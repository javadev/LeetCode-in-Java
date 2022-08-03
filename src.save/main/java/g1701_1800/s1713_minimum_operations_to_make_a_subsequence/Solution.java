package g1701_1800.s1713_minimum_operations_to_make_a_subsequence;

// #Hard #Array #Hash_Table #Greedy #Binary_Search
// #2022_04_24_Time_81_ms_(95.39%)_Space_60.5_MB_(96.05%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int minOperations(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            map.put(target[i], i);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                list.add(map.get(num));
            }
        }
        return target.length - longestIncreasingSubsequence(list);
    }

    private int longestIncreasingSubsequence(List<Integer> list) {
        int n = list.size();
        int l = 0;
        int[] arr = new int[n];
        for (int num : list) {
            int index = Arrays.binarySearch(arr, 0, l, num);
            if (index < 0) {
                index = ~index;
            }
            arr[index] = num;
            if (index == l) {
                l++;
            }
        }

        return l;
    }
}
