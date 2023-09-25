package g0801_0900.s0816_ambiguous_coordinates;

// #Medium #String #Backtracking #2022_03_23_Time_4_ms_(98.95%)_Space_48.9_MB_(73.68%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S107")
public class Solution {
    public List<String> ambiguousCoordinates(String s) {
        char[] sc = s.toCharArray();
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int commaPos = 2; commaPos < sc.length - 1; commaPos++) {
            if (isValidNum(sc, 1, commaPos - 1)) {
                if (isValidNum(sc, commaPos, sc.length - 2)) {
                    buildNums(result, sb, sc, commaPos - 1, 0, commaPos, sc.length - 2, 0);
                }
                for (int dp2Idx = commaPos + 1; dp2Idx < sc.length - 1; dp2Idx++) {
                    if (isValidDPNum(sc, commaPos, sc.length - 2, dp2Idx)) {
                        buildNums(result, sb, sc, commaPos - 1, 0, commaPos, sc.length - 2, dp2Idx);
                    }
                }
            }
            for (int dp1Idx = 2; dp1Idx < commaPos; dp1Idx++) {
                if (isValidDPNum(sc, 1, commaPos - 1, dp1Idx)) {
                    if (isValidNum(sc, commaPos, sc.length - 2)) {
                        buildNums(result, sb, sc, commaPos - 1, dp1Idx, commaPos, sc.length - 2, 0);
                    }
                    for (int dp2Idx = commaPos + 1; dp2Idx < sc.length - 1; dp2Idx++) {
                        if (isValidDPNum(sc, commaPos, sc.length - 2, dp2Idx)) {
                            buildNums(
                                    result,
                                    sb,
                                    sc,
                                    commaPos - 1,
                                    dp1Idx,
                                    commaPos,
                                    sc.length - 2,
                                    dp2Idx);
                        }
                    }
                }
            }
        }
        return result;
    }

    private boolean isValidNum(char[] sc, int startIdx, int lastIdx) {
        return sc[startIdx] != '0' || lastIdx - startIdx == 0;
    }

    private boolean isValidDPNum(char[] sc, int startIdx, int lastIdx, int dpIdx) {
        return (sc[startIdx] != '0' || dpIdx - startIdx == 1) && sc[lastIdx] != '0';
    }

    private void buildNums(
            List<String> result,
            StringBuilder sb,
            char[] sc,
            int last1Idx,
            int dp1Idx,
            int start2Idx,
            int last2Idx,
            int dp2Idx) {
        sb.setLength(0);
        sb.append('(');
        if (dp1Idx == 0) {
            sb.append(sc, 1, last1Idx - 1 + 1);
        } else {
            sb.append(sc, 1, dp1Idx - 1).append('.').append(sc, dp1Idx, last1Idx - dp1Idx + 1);
        }
        sb.append(',').append(' ');
        if (dp2Idx == 0) {
            sb.append(sc, start2Idx, last2Idx - start2Idx + 1);
        } else {
            sb.append(sc, start2Idx, dp2Idx - start2Idx)
                    .append('.')
                    .append(sc, dp2Idx, last2Idx - dp2Idx + 1);
        }
        sb.append(')');
        result.add(sb.toString());
    }
}
