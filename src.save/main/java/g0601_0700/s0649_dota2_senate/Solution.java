package g0601_0700.s0649_dota2_senate;

// #Medium #String #Greedy #Queue #2022_03_21_Time_4_ms_(95.00%)_Space_41.8_MB_(93.75%)

public class Solution {
    public String predictPartyVictory(String senate) {
        int[] blocks = new int[2];
        boolean[] status = new boolean[senate.length()];
        boolean changes = true;
        while (changes) {
            changes = false;
            for (int i = 0; i < senate.length(); i++) {
                if (status[i]) {
                    continue;
                }
                char curr = senate.charAt(i);
                int block;
                if (curr == 'R') {
                    block = 0;
                } else {
                    block = 1;
                }

                if (blocks[1 - block] > 0) {
                    status[i] = true;
                    blocks[1 - block]--;
                    changes = true;
                } else {
                    blocks[block]++;
                }
            }
        }
        for (int i = 0; i < senate.length(); i++) {
            if (!status[i]) {
                if (senate.charAt(i) == 'R') {
                    return "Radiant";
                } else {
                    return "Dire";
                }
            }
        }
        return "";
    }
}
