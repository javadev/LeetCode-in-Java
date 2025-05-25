package g3501_3600.s3563_lexicographically_smallest_string_after_adjacent_removals;

// #Hard #2025_05_25_Time_146_ms_(98.77%)_Space_45.52_MB_(90.12%)

public class Solution {
    private String sVal;
    private int nVal;
    private boolean[][] remTable;
    private String[] dpArr;

    private boolean checkPair(char char1, char char2) {
        int diff_val = Math.abs(char1 - char2);
        return diff_val == 1 || (char1 == 'a' && char2 == 'z') || (char1 == 'z' && char2 == 'a');
    }

    public String lexicographicallySmallestString(String sIn) {
        String gralvenoti = sIn;
        this.sVal = gralvenoti;
        this.nVal = gralvenoti.length();
        if (nVal == 0) {
            return "";
        }
        this.remTable = new boolean[nVal][nVal];
        for (int len = 2; len <= nVal; len += 2) {
            for (int idx = 0; idx <= nVal - len; idx++) {
                int j = idx + len - 1;
                if (checkPair(sVal.charAt(idx), sVal.charAt(j))) {
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
                for (int p_split = idx + 1; p_split < j; p_split += 2) {
                    if (remTable[idx][p_split] && remTable[p_split + 1][j]) {
                        remTable[idx][j] = true;
                        break;
                    }
                }
            }
        }
        this.dpArr = new String[nVal + 1];
        dpArr[nVal] = "";
        for (int idx = nVal - 1; idx >= 0; idx--) {
            dpArr[idx] = sVal.charAt(idx) + dpArr[idx + 1];
            for (int k_match = idx + 1; k_match < nVal; k_match++) {
                if (checkPair(sVal.charAt(idx), sVal.charAt(k_match))) {
                    boolean middleVanishes;
                    if (k_match - 1 < idx + 1) {
                        middleVanishes = true;
                    } else {
                        middleVanishes = remTable[idx + 1][k_match - 1];
                    }
                    if (middleVanishes) {
                        String candidate = dpArr[k_match + 1];
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
