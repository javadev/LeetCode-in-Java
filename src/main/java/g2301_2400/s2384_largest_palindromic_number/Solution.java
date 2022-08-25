package g2301_2400.s2384_largest_palindromic_number;

// #Medium #String #Hash_Table #Greedy #2022_08_25_Time_26_ms_(100.00%)_Space_54.8_MB_(100.00%)

public class Solution {
    public String largestPalindromic(String num) {
        int[] count = new int[10];
        int center = -1;
        StringBuilder first = new StringBuilder();
        StringBuilder second;
        for (char c : num.toCharArray()) {
            count[c - '0']++;
        }
        int c = 0;
        for (int i = 9; i >= 0; i--) {
            c = 0;
            if (count[i] % 2 == 1 && center == -1) {
                center = i;
            }
            if (first.length() == 0 && i == 0) {
                continue;
            }
            while (c < count[i] / 2) {
                first.append(String.valueOf(i));
                c++;
            }
        }
        second = new StringBuilder(first.toString());
        if (center != -1) {
            first.append(center);
        }
        first.append(second.reverse().toString());
        return first.length() == 0 ? "0" : first.toString();
    }
}
