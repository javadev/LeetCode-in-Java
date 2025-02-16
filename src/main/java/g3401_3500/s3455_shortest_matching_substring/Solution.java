package g3401_3500.s3455_shortest_matching_substring;

// #Hard #2025_02_16_Time_976_ms_(100.00%)_Space_45.76_MB_(100.00%)

public class Solution {
    public int shortestMatchingSubstring(String s, String p) {
        int minLen = Integer.MAX_VALUE;
        String[] ar = p.split("\\*");
        int arlen = ar.length;
        if (arlen == 0) {
            return 0;
        }
        String temp = p.replace("*", "");
        if (s.contains(temp)) {
            return temp.length();
        }
        int f = s.indexOf(ar[0]);
        while (f != -1) {
            int shortLen = Integer.MAX_VALUE;
            if (arlen > 1) {
                int sec = s.indexOf(ar[1], f + ar[0].length());
                while (sec != -1) {
                    if (ar[0].isEmpty()) {
                        f = sec;
                    }
                    if (arlen > 2) {
                        int third = s.indexOf(ar[2], sec + ar[1].length());
                        if (third != -1) {
                            if (ar[0].isEmpty() && ar[1].isEmpty()) {
                                f = third;
                            }
                            shortLen = third + ar[2].length() - f;
                            minLen = Math.min(shortLen, minLen);
                            if (minLen == p.length() - 2) {
                                return minLen;
                            }
                            if (minLen == Integer.MAX_VALUE) {
                                return -1;
                            }
                        }
                    } else {
                        shortLen = sec + ar[1].length() - f;
                        minLen = Math.min(shortLen, minLen);
                    }
                    if (minLen == p.length() - 2) {
                        return minLen;
                    }
                    if (ar[1].isEmpty()) {
                        sec = -1;
                    } else {
                        sec = s.indexOf(ar[1], sec + 1);
                    }
                    if (minLen == Integer.MAX_VALUE) {
                        return -1;
                    }
                }
            } else {
                shortLen = f + ar[0].length() - f;
                minLen = shortLen;
            }
            minLen = Math.min(shortLen, minLen);
            if (minLen == p.length() - 2) {
                return minLen;
            }
            if (ar[0].isEmpty()) {
                f = -1;
            } else {
                f = s.indexOf(ar[0], f + 1);
            }
            if (minLen == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return -1;
        }
        return minLen;
    }
}
