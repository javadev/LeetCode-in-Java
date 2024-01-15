package g2901_3000.s2951_find_the_peaks;

// #Easy #Array #Enumeration #2024_01_15_Time_1_ms_(100.00%)_Space_43.8_MB_(79.61%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if ((mountain[i - 1] < mountain[i]) && (mountain[i] > mountain[i + 1])) {
                list.add(i);
            }
        }
        return list;
    }
}
