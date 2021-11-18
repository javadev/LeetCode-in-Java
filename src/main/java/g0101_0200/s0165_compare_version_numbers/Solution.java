package g0101_0200.s0165_compare_version_numbers;

public class Solution {
    private Solution() {}

    public static int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.", 0);
        String[] ver2 = version2.split("\\.", 0);
        int i = 0;
        while (i < ver1.length && i < ver2.length) {
            String s1 = removeLeadingZero(ver1[i]);
            String s2 = removeLeadingZero(ver2[i]);
            if (Integer.valueOf(s1) > Integer.valueOf(s2)) {
                return 1;
            } else if (Integer.valueOf(s1) < Integer.valueOf(s2)) {
                return -1;
            }
            i++;
        }
        while (i < ver1.length) {
            String s1 = removeLeadingZero(ver1[i]);
            i++;
            if (Integer.valueOf(s1) == 0) {
                continue;
            }
            return (Integer.valueOf(s1) > 0) ? 1 : -1;
        }
        while (i < ver2.length) {
            String s2 = removeLeadingZero(ver2[i]);
            i++;
            if (Integer.valueOf(s2) == 0) {
                continue;
            }
            return (Integer.valueOf(s2) > 0) ? -1 : 1;
        }
        return 0;
    }

    private static String removeLeadingZero(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        return (i != s.length()) ? s.substring(i) : "0";
    }
}
