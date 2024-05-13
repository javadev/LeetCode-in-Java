package g0001_0100.s0093_restore_ip_addresses;

// #Medium #String #Backtracking #2024_05_13_Time_1_ms_(99.27%)_Space_42_MB_(90.75%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int SEG_COUNT = 4;
    private List<String> result = new ArrayList<>();
    private int[] segments = new int[SEG_COUNT];

    public List<String> restoreIpAddresses(String s) {
        dfs(s, 0, 0);
        return result;
    }

    public void dfs(String s, int segId, int segStart) {
        // find 4 segments and get to last index
        if (segId == SEG_COUNT) {
            if (segStart == s.length()) {
                StringBuilder addr = new StringBuilder();
                for (int i = 0; i < SEG_COUNT; i++) {
                    addr.append(segments[i]);
                    if (i != SEG_COUNT - 1) {
                        addr.append('.');
                    }
                }
                result.add(addr.toString());
            }
            return;
        }
        // last index and no 4 segments
        if (segStart == s.length()) {
            return;
        }
        // start with a zero
        if (s.charAt(segStart) == '0') {
            segments[segId] = 0;
            dfs(s, segId + 1, segStart + 1);
            return;
        }
        int addr = 0;
        for (int index = segStart; index < s.length(); index++) {
            addr = addr * 10 + s.charAt(index) - '0';
            if (addr >= 0 && addr <= 255) {
                segments[segId] = addr;
                dfs(s, segId + 1, index + 1);
            } else {
                break;
            }
        }
    }
}
