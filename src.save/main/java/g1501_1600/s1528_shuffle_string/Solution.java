package g1501_1600.s1528_shuffle_string;

// #Easy #Array #String #2022_04_09_Time_2_ms_(54.77%)_Space_45_MB_(34.67%)

public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int index = findIndex(indices, i);
            c[i] = s.charAt(index);
        }
        return new String(c);
    }

    private static int findIndex(int[] indices, int i) {
        for (int j = 0; j < indices.length; j++) {
            if (indices[j] == i) {
                return j;
            }
        }
        return 0;
    }
}
