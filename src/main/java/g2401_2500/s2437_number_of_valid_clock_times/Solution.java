package g2401_2500.s2437_number_of_valid_clock_times;

// #Easy #String #Enumeration #2022_12_07_Time_0_ms_(100.00%)_Space_42.2_MB_(29.58%)

public class Solution {
    public int countTime(String time) {
        int[] counts = new int[] {3, 10, 0, 6, 10};
        char[] ch = time.toCharArray();
        int result = 1;
        if (ch[0] == '2') {
            counts[1] = 4;
        }
        if ((ch[1] - '0') > 3) {
            counts[0] = 2;
        }
        if (ch[0] == '?' && ch[1] == '?') {
            counts[0] = 1;
            counts[1] = 24;
        }
        for (int i = 0; i < 5; i++) {
            char ch1 = ch[i];
            if (ch1 == '?') {
                result *= counts[i];
            }
        }
        return result;
    }
}
