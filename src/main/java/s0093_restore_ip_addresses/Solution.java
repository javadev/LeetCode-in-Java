package s0093_restore_ip_addresses;

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
                    String.valueOf(
                            new StringBuilder()
                                    .append(octets[0])
                                    .append('.')
                                    .append(octets[1])
                                    .append('.')
                                    .append(octets[2])
                                    .append('.')
                                    .append(octets[3])));
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
