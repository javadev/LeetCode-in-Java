package g3501_3600.s3563_lexicographically_smallest_string_after_adjacent_removals;

// #Hard #String #Dynamic_Programming #2025_05_27_Time_121_ms_(99.09%)_Space_45.25_MB_(100.00%)

public class Solution {
    private boolean checkPair(char char1, char char2) {
        int diffVal = Math.abs(char1 - char2);
        return diffVal == 1 || (char1 == 'a' && char2 == 'z') || (char1 == 'z' && char2 == 'a');
    }

    public String lexicographicallySmallestString(String sIn) {
        int nVal = sIn.length();
        if (nVal == 0) {
            return "";
        }
        boolean[][] remTable = new boolean[nVal][nVal];
        for (int len = 2; len <= nVal; len += 2) {
            for (int idx = 0; idx <= nVal - len; idx++) {
                int j = idx + len - 1;
                if (checkPair(sIn.charAt(idx), sIn.charAt(j))) {
                    if (len == 2) {
                        remTable[idx][j] = true;
                    } else {
                        if (remTable[idx + 1][j - 1]) {
                            remTable[idx][j] = true;
                        }
                    }
                }
                if (remTable[idx][j]) {
                    continue;
                }
                for (int pSplit = idx + 1; pSplit < j; pSplit += 2) {
                    if (remTable[idx][pSplit] && remTable[pSplit + 1][j]) {
                        remTable[idx][j] = true;
                        break;
                    }
                }
            }
        }
        String[] dpArr = new String[nVal + 1];
        dpArr[nVal] = "";
        for (int idx = nVal - 1; idx >= 0; idx--) {
            dpArr[idx] = sIn.charAt(idx) + dpArr[idx + 1];
            for (int kMatch = idx + 1; kMatch < nVal; kMatch++) {
                if (checkPair(sIn.charAt(idx), sIn.charAt(kMatch))) {
                    boolean middleVanishes;
                    if (kMatch - 1 < idx + 1) {
                        middleVanishes = true;
                    } else {
                        middleVanishes = remTable[idx + 1][kMatch - 1];
                    }
                    if (middleVanishes) {
                        String candidate = dpArr[kMatch + 1];
                        if (candidate.compareTo(dpArr[idx]) < 0) {
                            dpArr[idx] = candidate;
                        }
                    }
                }
            }
        }
        return dpArr[0];
    }
}
