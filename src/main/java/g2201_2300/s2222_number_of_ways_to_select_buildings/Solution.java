package g2201_2300.s2222_number_of_ways_to_select_buildings;

// #Medium #String #Dynamic_Programming #Prefix_Sum
// #2022_06_12_Time_19_ms_(98.28%)_Space_42.6_MB_(98.62%)

public class Solution {
    public long numberOfWays(String s) {
        long z = 0;
        long o = 0;
        long zo = 0;
        long oz = 0;
        long zoz = 0;
        long ozo = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zoz += zo;
                oz += o;
                z++;
            } else {
                ozo += oz;
                zo += z;
                o++;
            }
        }
        return zoz + ozo;
    }
}
