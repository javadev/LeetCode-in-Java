package g0001_0100.s0093_restore_ip_addresses;

// #Medium #String #Backtracking #2022_06_21_Time_13_ms_(24.23%)_Space_42.8_MB_(71.26%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> results = new ArrayList<>();
        step(s, 0, new int[4], 0, results);
        return results;
    }

    void step(String s, int pos, int[] octets, int count, List<String> results) {
        if (count == 4 && pos == s.length()) {
            results.add(
                    String.valueOf(octets[0])
                            + '.'
                            + octets[1]
                            + '.'
                            + octets[2]
                            + '.'
                            + octets[3]);
        } else if (count < 4 && pos < 12) {
            int octet = 0;
            for (int i = 0; i < 3; i++) {
                if (pos + i < s.length()) {
                    int digit = s.charAt(pos + i) - '0';
                    octet = octet * 10 + digit;
                    if (octet < 256) {
                        octets[count] = octet;
                        step(s, pos + i + 1, octets, count + 1, results);
                    }
                    if (i == 0 && digit == 0) {
                        break;
                    }
                }
            }
        }
    }
}
