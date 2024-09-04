package g3201_3300.s3271_hash_divided_string;

// #Medium #String #Simulation #2024_09_02_Time_2_ms_(100.00%)_Space_44.7_MB_(100.00%)

public class Solution {
    public String stringHash(String s, int k) {
        var result = new StringBuilder();
        int i = 0;
        int sum = 0;
        while (i < s.length()) {
            sum += s.charAt(i) - 'a';
            if ((i + 1) % k == 0) {
                result.append((char) ('a' + sum % 26));
                sum = 0;
            }
            i++;
        }
        return result.toString();
    }
}
