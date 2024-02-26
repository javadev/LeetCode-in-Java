package g2301_2400.s2381_shifting_letters_ii;

// #Medium #Array #String #Prefix_Sum #2022_08_25_Time_10_ms_(75.00%)_Space_82.7_MB_(75.00%)

public class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] diff = new int[s.length() + 1];
        int l;
        int r;
        for (int[] shift : shifts) {
            l = shift[0];
            r = shift[1] + 1;
            diff[l] += 26;
            diff[r] += 26;
            if (shift[2] == 0) {
                diff[l]--;
                diff[r]++;
            } else {
                diff[l]++;
                diff[r]--;
            }
            diff[l] %= 26;
            diff[r] %= 26;
        }
        StringBuilder sb = new StringBuilder();
        int current = 0;
        int val;
        for (int i = 0; i < s.length(); ++i) {
            current += diff[i];
            val = s.charAt(i) - 'a';
            val += current;
            val %= 26;
            sb.append((char) ('a' + val));
        }
        return sb.toString();
    }
}
