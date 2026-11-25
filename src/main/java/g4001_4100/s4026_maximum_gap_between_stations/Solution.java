package g4001_4100.s4026_maximum_gap_between_stations;

// #Medium #String #Greedy #Two_Pointers #Staff #Weekly_Contest_515
// #2026_11_25_Time_28_ms_(100.00%)_Space_47.45_MB_(96.06%)

public class Solution {
    public int maximumGap(String skill, String station) {
        if (skill.length() == 1) {
            return 0;
        }
        return maximumGap(skill.toCharArray(), station.toCharArray());
    }

    private static int maximumGap(char[] skill, char[] station) {
        int n = skill.length;
        int[] last = new int[n];
        int pos = station.length - 1;
        for (int i = n - 1; i >= 0; --i) {
            while (station[pos] != skill[i]) {
                --pos;
            }
            last[i] = (pos--);
        }
        int result = 0;
        pos = 0;
        for (int i = 0, limit = n - 1; i < limit; ++i) {
            while (station[pos] != skill[i]) {
                ++pos;
            }
            result = Math.max(result, last[i + 1] - pos);
            ++pos;
        }
        return result;
    }
}
