package g3301_3400.s3389_minimum_operations_to_make_character_frequencies_equal;

// #Hard #String #Hash_Table #Dynamic_Programming #Counting #Enumeration
// #2024_12_18_Time_4_ms_(100.00%)_Space_44.8_MB_(67.80%)

public class Solution {
    public int makeStringGood(String s) {
        int[] freqarr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freqarr[s.charAt(i) - 'a'] += 1;
        }
        int ctr = 0;
        int max = 0;
        for (int i = 0; i < 26; i++) {
            ctr = freqarr[i] != 0 ? ctr + 1 : ctr;
            max = freqarr[i] != 0 ? Math.max(max, freqarr[i]) : max;
        }
        if (ctr == 0) {
            return 0;
        }
        int minops = 2 * 10000;
        for (int j = 0; j <= max; j++) {
            int ifdel = 0;
            int ifadd = 0;
            int free = 0;
            for (int i = 0; i < 26; i++) {
                if (freqarr[i] == 0) {
                    free = 0;
                    continue;
                }
                if (freqarr[i] >= j) {
                    ifdel = Math.min(ifdel, ifadd) + freqarr[i] - j;
                    free = freqarr[i] - j;
                    ifadd = 2 * 10000;
                } else {
                    int currifdel = Math.min(ifdel, ifadd) + freqarr[i];
                    int currifadd =
                            Math.min(
                                    ifadd + j - freqarr[i],
                                    ifdel + Math.max(0, j - freqarr[i] - free));
                    ifadd = currifadd;
                    ifdel = currifdel;
                    free = freqarr[i];
                }
            }
            minops = Math.min(minops, Math.min(ifdel, ifadd));
        }
        return minops;
    }
}
