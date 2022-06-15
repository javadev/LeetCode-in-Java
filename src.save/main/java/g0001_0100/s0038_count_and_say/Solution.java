package g0001_0100.s0038_count_and_say;

// #Medium #Top_Interview_Questions #String #2022_06_15_Time_2_ms_(99.52%)_Space_39.7_MB_(96.35%)

public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder res = new StringBuilder();
        String prev = countAndSay(n - 1);
        int count = 1;
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                res.append(count).append(prev.charAt(i - 1));
                count = 1;
            }
        }
        res.append(count).append(prev.charAt(prev.length() - 1));
        return res.toString();
    }
}
