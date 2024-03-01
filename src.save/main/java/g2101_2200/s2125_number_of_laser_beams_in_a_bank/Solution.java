package g2101_2200.s2125_number_of_laser_beams_in_a_bank;

// #Medium #Array #String #Math #Matrix #2022_06_02_Time_19_ms_(76.00%)_Space_57.3_MB_(20.78%)

public class Solution {
    public int numberOfBeams(String[] bank) {
        int beam = 0;
        int prev = 0;
        for (String s : bank) {
            int nos = 0;
            for (char j : s.toCharArray()) {
                if (j == '1') {
                    nos++;
                }
            }
            if (nos > 0) {
                if (prev == 0) {
                    prev = nos;
                } else {
                    beam += prev * nos;
                    prev = nos;
                }
            }
        }
        return beam;
    }
}
