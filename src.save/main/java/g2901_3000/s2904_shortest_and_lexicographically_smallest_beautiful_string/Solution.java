package g2901_3000.s2904_shortest_and_lexicographically_smallest_beautiful_string;

// #Medium #String #Sliding_Window #2023_12_26_Time_1_ms_(100.00%)_Space_42.3_MB_(21.39%)

public class Solution {
    private int n = 0;

    private int nextOne(String s, int i) {
        for (i++; i < n; i++) {
            if (s.charAt(i) == '1') {
                return i;
            }
        }
        return -1;
    }

    public String shortestBeautifulSubstring(String s, int k) {
        n = s.length();
        int i = nextOne(s, -1);
        int j = i;
        int c = 1;
        while (c != k && j != -1) {
            j = nextOne(s, j);
            c++;
        }
        if (c != k || j == -1) {
            return "";
        }
        int min = j - i + 1;
        String r = s.substring(i, i + min);
        i = nextOne(s, i);
        j = nextOne(s, j);
        while (j != -1) {
            int temp = j - i + 1;
            if (temp < min) {
                min = j - i + 1;
                r = s.substring(i, i + min);
            } else if (temp == min) {
                String r1 = s.substring(i, i + min);
                if (r1.compareTo(r) < 0) {
                    r = r1;
                }
            }
            i = nextOne(s, i);
            j = nextOne(s, j);
        }
        return r;
    }
}
