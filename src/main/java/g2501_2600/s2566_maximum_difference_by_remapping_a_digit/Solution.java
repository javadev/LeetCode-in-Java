package g2501_2600.s2566_maximum_difference_by_remapping_a_digit;

// #Easy #Math #Greedy #2023_08_21_Time_1_ms_(98.06%)_Space_39.2_MB_(82.52%)

public class Solution {
    public int minMaxDifference(int num) {
        int i;
        char c = 'x';
        String s = String.valueOf(num);
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                c = s.charAt(i);
                break;
            }
        }
        char x = s.charAt(0);
        s = s.replace(c, '9');
        String s1 = String.valueOf(num);
        s1 = s1.replace(x, '0');
        int n1 = Integer.parseInt(s);
        int n2 = Integer.parseInt(s1);
        return n1 - n2;
    }
}
