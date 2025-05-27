package g3501_3600.s3561_resulting_string_after_adjacent_removals;

// #Medium #String #Stack #Simulation #2025_05_27_Time_36_ms_(100.00%)_Space_46.01_MB_(75.40%)

public class Solution {
    public String resultingString(String s) {
        int n = s.length();
        int p = 0;
        char[] buf = new char[n];
        for (char c : s.toCharArray()) {
            if (p > 0) {
                int d = buf[p - 1] - c;
                int ad = d < 0 ? -d : d;
                if (ad == 1 || ad == 25) {
                    p--;
                    continue;
                }
            }
            buf[p++] = c;
        }
        return new String(buf, 0, p);
    }
}
