package g2201_2300.s2222_number_of_ways_to_select_buildings;

// #Medium #String #Dynamic_Programming #Prefix_Sum
// #2022_06_12_Time_19_ms_(98.28%)_Space_42.6_MB_(98.62%)

public class Solution {
    public long numberOfWays(String s) {
        long z = 0, o = 0, zo = 0, oz = 0, zoz = 0, ozo = 0;
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
