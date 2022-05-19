package g1901_2000.s1957_delete_characters_to_make_fancy_string;

// #Easy #String #2022_05_19_Time_34_ms_(93.79%)_Space_42.9_MB_(97.04%)

public class Solution {
    public String makeFancyString(String s) {
        char[] ar = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ar.length - 2; i++) {
            if ((ar[i] != ar[i + 1]) || (ar[i + 1] != ar[i + 2])) {
                sb.append(ar[i]);
            }
        }
        if (ar.length >= 2) {
            sb.append(ar[ar.length - 2]).append(ar[ar.length - 1]);
        } else if (ar.length == 1) {
            sb.append(ar[ar.length - 1]);
        }
        return sb.toString();
    }
}
