package g2701_2800.s2800_shortest_string_that_contains_three_strings;

// #Medium #String #Greedy #Enumeration #2023_09_14_Time_12_ms_(100.00%)_Space_44_MB_(93.19%)

public class Solution {
    public String minimumString(String a, String b, String c) {
        char[] ar = a.toCharArray();
        char[] br = b.toCharArray();
        char[] cr = c.toCharArray();
        return new String(
                getSmaller(
                        combine(ar, br, cr),
                        getSmaller(
                                combine(ar, cr, br),
                                getSmaller(
                                        combine(br, ar, cr),
                                        getSmaller(
                                                combine(br, cr, ar),
                                                getSmaller(
                                                        combine(cr, ar, br),
                                                        combine(cr, br, ar)))))));
    }

    private char[] combine(char[] a, char[] b, char[] c) {
        return combine(combine(a, b), c);
    }

    private char[] combine(char[] a, char[] b) {
        int insertIndex = a.length;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] == b[0]) {
                int ii = i + 1;
                int match = 1;
                for (int j = 1; j < b.length && ii < a.length; j++, ii++) {
                    if (a[ii] == b[j]) {
                        match++;
                    } else {
                        break;
                    }
                }
                if (match == b.length) {
                    return a;
                } else if (match == a.length - i) {
                    insertIndex = i;
                    break;
                }
            }
        }
        char[] tmp = new char[b.length + insertIndex];
        System.arraycopy(a, 0, tmp, 0, insertIndex);
        System.arraycopy(b, 0, tmp, insertIndex, b.length);
        return tmp;
    }

    private char[] getSmaller(char[] res, char[] test) {
        if (res.length > test.length) {
            return test;
        } else if (res.length < test.length) {
            return res;
        } else {
            for (int i = 0; i < res.length; ++i) {
                if (res[i] > test[i]) {
                    return test;
                } else if (res[i] < test[i]) {
                    return res;
                }
            }
        }
        return res;
    }
}
