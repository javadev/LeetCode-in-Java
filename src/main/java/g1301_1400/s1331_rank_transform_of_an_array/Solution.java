package g1301_1400.s1331_rank_transform_of_an_array;

// #Easy #Array #Hash_Table #Sorting #2022_03_19_Time_22_ms_(98.50%)_Space_58.4_MB_(93.72%)

import java.util.Arrays;
import java.util.HashMap;

@SuppressWarnings("java:S3824")
public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] tmp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tmp);
        HashMap<Integer, Integer> mp = new HashMap<>();
        int i = 1;
        for (Integer x : tmp) {
            if (!mp.containsKey(x)) {
                mp.put(x, i++);
            }
        }
        i = 0;
        for (Integer x : arr) {
            arr[i++] = mp.get(x);
        }
        return arr;
    }
}
