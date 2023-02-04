package g2301_2400.s2380_time_needed_to_rearrange_a_binary_string;

// #Medium #String #Dynamic_Programming #Simulation
// #2022_08_23_Time_3_ms_(70.00%)_Space_41.8_MB_(70.00%)

public class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int lastOne = -1;
        int result = 0;
        int prevResult = 0;
        int curResult = 0;
        int countOne = 0;
        int countZero = 0;
        int diff;
        int pTarget;
        int pWait;
        int cTarget;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') {
                ++countZero;
                continue;
            }
            ++countOne;
            diff = i - lastOne - 1;
            prevResult = curResult;
            cTarget = countOne - 1;
            pTarget = cTarget - 1;
            pWait = prevResult - (lastOne - pTarget);
            if (diff > pWait) {
                curResult = countZero;
            } else {
                curResult = countZero == 0 ? 0 : pWait - diff + 1 + countZero;
            }
            result = curResult;
            lastOne = i;
        }
        return result;
    }
}
