package g3401_3500.s3499_maximize_active_section_with_trade_i;

// #Medium #String #Enumeration #2025_04_01_Time_54_ms_(97.98%)_Space_45.89_MB_(76.19%)

public class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int oneCount = 0;
        int convertedOne = 0;
        int curZeroCount = 0;
        int lastZeroCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') {
                curZeroCount++;
            } else {
                if (curZeroCount != 0) {
                    lastZeroCount = curZeroCount;
                }
                curZeroCount = 0;
                oneCount++;
            }
            convertedOne = Math.max(convertedOne, curZeroCount + lastZeroCount);
        }
        // corner case
        if (convertedOne == curZeroCount || convertedOne == lastZeroCount) {
            return oneCount;
        }
        return oneCount + convertedOne;
    }
}
