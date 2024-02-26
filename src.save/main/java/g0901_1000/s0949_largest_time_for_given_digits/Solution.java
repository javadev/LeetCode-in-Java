package g0901_1000.s0949_largest_time_for_given_digits;

// #Medium #String #Enumeration #2022_12_26_Time_11_ms_(70.67%)_Space_42.6_MB_(42.79%)

public class Solution {
    public String largestTimeFromDigits(int[] arr) {
        StringBuilder buf = new StringBuilder();
        String maxHour = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    String hour = getTime(arr, i, j, 23, false);
                    String min = getTime(arr, i, j, 59, true);
                    if (hour != null && min != null && hour.compareTo(maxHour) > 0) {
                        buf.setLength(0);
                        buf.append(hour).append(':').append(min);
                        maxHour = hour;
                    }
                }
            }
        }
        return buf.toString();
    }

    private String getTime(int[] arr, int i, int j, int limit, boolean exclude) {
        int n1 = -1;
        int n2 = -1;
        for (int k = 0; k < 4; k++) {
            if ((exclude && k != i && k != j) || (!exclude && (k == i || k == j))) {
                if (n1 == -1) {
                    n1 = arr[k];
                } else {
                    n2 = arr[k];
                }
            }
        }
        String s1 = String.valueOf(n1) + n2;
        String s2 = String.valueOf(n2) + n1;
        int v1 = Integer.parseInt(s1);
        if (v1 > limit) {
            v1 = -1;
            s1 = null;
        }
        int v2 = Integer.parseInt(s2);
        if (v2 > limit) {
            v2 = -1;
            s2 = null;
        }
        return v1 >= v2 ? s1 : s2;
    }
}
