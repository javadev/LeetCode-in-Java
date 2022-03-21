package g1301_1400.s1363_largest_multiple_of_three;

// #Hard #Array #Dynamic_Programming #Greedy #2022_03_21_Time_8_ms_(68.94%)_Space_42.9_MB_(89.39%)

import java.util.Collections;

public class Solution {
    private String printRes(int[] counts) {
        StringBuilder ans = new StringBuilder();
        for (int i = 9; i > -1; i--) {
            ans.append(String.join("", Collections.nCopies(counts[i], String.valueOf(i))));
        }
        String regex = "^0+(?!$)";
        return ans.toString().replaceAll(regex, "");
    }

    public String largestMultipleOfThree(int[] digits) {
        int[] counts = new int[10];
        int total = 0;
        for (int digit : digits) {
            counts[digit] += 1;
            total += digit;
        }
        if (total % 3 == 0) {
            return printRes(counts);
        } else if (total % 3 == 1) {
            boolean found = false;
            for (int i = 1; i < 10; i += 3) {
                if (counts[i] > 0) {
                    counts[i]--;
                    found = true;
                    break;
                }
            }
            if (found) {
                return printRes(counts);
            }
            for (int i = 2; i < 10; i += 3) {
                if (counts[i] > 1) {
                    counts[i] -= 2;
                    found = true;
                    break;
                }
            }
            if (found) {
                return printRes(counts);
            }
            boolean found1 = false;
            for (int i = 2; i < 10; i += 3) {
                if (counts[i] > 0) {
                    counts[i]--;
                    if (found1) {
                        found = true;
                    }
                    if (!found1) {
                        found1 = true;
                    }
                    if (found) {
                        break;
                    }
                }
            }
            if (found) {
                return printRes(counts);
            }
        } else if (total % 3 == 2) {
            boolean found = false;
            for (int i = 2; i < 10; i += 3) {
                if (counts[i] > 0) {
                    counts[i]--;
                    found = true;
                    break;
                }
            }
            if (found) {
                return printRes(counts);
            }
            for (int i = 1; i < 10; i += 3) {
                if (counts[i] > 1) {
                    counts[i] -= 2;
                    found = true;
                    break;
                }
            }
            if (found) {
                return printRes(counts);
            }
            boolean found1 = false;
            for (int i = 1; i < 10; i += 3) {
                if (counts[i] > 0) {
                    counts[i]--;
                    if (found1) {
                        found = true;
                    }
                    if (!found1) {
                        found1 = true;
                    }
                    if (found) {
                        break;
                    }
                }
            }
            if (found) {
                return printRes(counts);
            }
        }
        return "";
    }
}
