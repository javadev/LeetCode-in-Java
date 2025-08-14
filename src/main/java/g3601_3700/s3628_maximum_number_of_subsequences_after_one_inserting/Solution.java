package g3601_3700.s3628_maximum_number_of_subsequences_after_one_inserting;

// #Medium #String #Dynamic_Programming #Greedy #Prefix_Sum #Weekly_Contest_460
// #2025_08_14_Time_12_ms_(100.00%)_Space_45.79_MB_(76.82%)

public class Solution {
    public long numOfSubsequences(String s) {
        long tc = 0;
        char[] chs = s.toCharArray();
        for (char c : chs) {
            tc += (c == 'T') ? 1 : 0;
        }
        long ls = 0;
        long cs = 0;
        long lcf = 0;
        long ctf = 0;
        long lct = 0;
        long ocg = 0;
        long tp = 0;
        for (char curr : chs) {
            long rt = tc - tp;
            long cg = ls * rt;
            ocg = (cg > ocg) ? cg : ocg;
            if (curr == 'L') {
                ls++;
            } else {
                if (curr == 'C') {
                    cs++;
                    lcf += ls;
                } else {
                    if (curr == 'T') {
                        lct += lcf;
                        ctf += cs;
                        tp++;
                    }
                }
            }
        }
        long fcg = ls * (tc - tp);
        ocg = fcg > ocg ? fcg : ocg;
        long maxi = 0;
        long[] bo = {lcf, ctf, ocg};
        for (long op : bo) {
            maxi = op > maxi ? op : maxi;
        }
        return lct + maxi;
    }
}
