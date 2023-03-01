package g1001_1100.s1012_numbers_with_repeated_digits;

// #Hard #Dynamic_Programming #Math #2022_02_25_Time_3_ms_(28.17%)_Space_41.8_MB_(7.04%)

import java.util.HashSet;

@SuppressWarnings("java:S2583")
public class Solution {
    private int noRepeatCount = 0;

    public int numDupDigitsAtMostN(int n) {
        int nStrLength = String.valueOf(n).length();
        int allNineLength;
        if (n < 0 || nStrLength < 2) {
            return 0;
        } else if (Math.pow(10, nStrLength) - 1 == n) {
            allNineLength = nStrLength;
        } else {
            allNineLength = nStrLength - 1;
        }
        for (int numberOfDigits = 1; numberOfDigits <= allNineLength; numberOfDigits++) {
            noRepeatCount += calcNumberOfNoRepeat(numberOfDigits);
        }
        if (Math.pow(10, nStrLength) - 1 > n) {
            int mutations = 10;
            HashSet<Integer> hs = new HashSet<>();
            for (int index1 = 0; index1 < nStrLength; index1++) {
                int noRepeatCountLocal = 0;
                hs.clear();
                for (int index2 = 0; index2 < nStrLength; index2++) {
                    int index2Digit =
                            (int)
                                    (n
                                            / Math.pow(
                                                    10, String.valueOf(n).length() - (index2 + 1.0))
                                            % 10);
                    if (index2 < index1) {
                        if (hs.contains(index2Digit)) {
                            noRepeatCountLocal = 0;
                            break;
                        } else {
                            hs.add(index2Digit);
                        }
                    } else if (index2 == index1) {
                        if (index2 == 0) {
                            noRepeatCountLocal = index2Digit - 1;
                        } else {
                            int inIndex2Range = 0;
                            for (int j : hs) {
                                if ((index2 < nStrLength - 1 && j <= index2Digit - 1)
                                        || (index2 == nStrLength - 1 && j <= index2Digit)) {
                                    inIndex2Range++;
                                }
                            }
                            if (index2 == nStrLength - 1) {
                                noRepeatCountLocal = index2Digit + 1 - inIndex2Range;
                            } else {
                                noRepeatCountLocal = index2Digit - inIndex2Range;
                            }
                        }
                    } else {
                        noRepeatCountLocal *= mutations - index2;
                    }
                }
                if (noRepeatCountLocal > 0) {
                    noRepeatCount += noRepeatCountLocal;
                }
            }
        }
        return n - noRepeatCount;
    }

    private int calcNumberOfNoRepeat(int numberOfDigits) {
        int repeatCount = 0;
        int mutations = 9;
        for (int i = 0; i < numberOfDigits; i++) {
            if (i == 0) {
                repeatCount = mutations;
            } else {
                repeatCount *= mutations--;
            }
        }
        return repeatCount;
    }
}
