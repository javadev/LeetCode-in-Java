package g1301_1400.s1331_rank_transform_of_an_array;

// #Easy #Array #Hash_Table #Sorting #2022_03_19_Time_22_ms_(98.50%)_Space_58.4_MB_(93.72%)

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] tmp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tmp);
        HashMap<Integer, Integer> mp = new HashMap<>();
        final int[] i = {1};
        for (Integer x : tmp) {
            mp.computeIfAbsent(x, k -> mp.put(k, i[0]++));
        }

        i[0] = 0;
        for (Integer x : arr) {
            arr[i[0]++] = mp.get(x);
        }
        return arr;
    }
}
