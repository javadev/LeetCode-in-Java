package g0201_0300.s0274_h_index;

// #Medium #Array #Sorting #Counting_Sort #2022_11_05_Time_0_ms_(100.00%)_Space_40.3_MB_(86.98%)

public class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] freqArray = new int[len + 1];
        for (int citation : citations) {
            freqArray[Math.min(citation, len)]++;
        }
        int totalSoFar = 0;
        for (int k = len; k >= 0; k--) {
            totalSoFar += freqArray[k];
            if (totalSoFar >= k) {
                return k;
            }
        }
        return -1;
    }
}
