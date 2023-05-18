package g0901_1000.s0972_equal_rational_numbers;

// #Hard #String #Math #2022_03_31_Time_4_ms_(56.67%)_Space_43.5_MB_(6.67%)

public class Solution {
    public boolean isRationalEqual(String s, String t) {
        int sLeftIndex = s.indexOf("(");
        int tLeftIndex = t.indexOf("(");
        // if they are integer or only with non repeating part
        if (sLeftIndex < 0 && tLeftIndex < 0) {
            return Double.valueOf(s).equals(Double.valueOf(t));
        }
        // get the first 100 (or so) digits of s and t
        double sDouble;
        double tDouble;
        if (sLeftIndex >= 0) {
            s = s.substring(0, sLeftIndex) + repeat(s.substring(sLeftIndex + 1, s.length() - 1));
            sDouble = Double.parseDouble(s.substring(0, 100));
        } else {
            sDouble = Double.parseDouble(s);
        }
        if (tLeftIndex >= 0) {
            t = t.substring(0, tLeftIndex) + repeat(t.substring(tLeftIndex + 1, t.length() - 1));
            tDouble = Double.parseDouble(t.substring(0, 100));
        } else {
            tDouble = Double.parseDouble(t);
        }
        return sDouble == tDouble;
    }

    private String repeat(String a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(a);
        }
        return sb.toString();
    }
}
