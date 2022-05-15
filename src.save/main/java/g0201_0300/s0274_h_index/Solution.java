package g0201_0300.s0274_h_index;

// #Medium #Array #Sorting #Counting_Sort #Acceptance_37.6%
// #2022_03_14_Time_2_ms_(51.85%)_Space_43_MB_(5.41%)

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        // Sort array then traverse from end keep track of counter denoting total elements seen so
        // far
        Arrays.sort(citations);
        int count = 0;
        int hIndex = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (i == citations.length - 1 && count == citations[i]) {
                hIndex = citations[i];
                return hIndex;
                //  Ex:- 7 10--> counter =8
            } else if (citations[i] <= count && count < citations[i + 1]) {
                hIndex = count;
                return hIndex;
                // Ex:- 7 9 --> counter 6 (incuding 7 there willbe 7 elements)
            } else if (citations[i] == count + 1) {
                hIndex = count + 1;
                return hIndex;
            } else {
                count++;
            }
        }
        // case when no element is hindex so far
        if (count < citations[0]) {
            hIndex = count;
        }
        return hIndex;
    }
}
