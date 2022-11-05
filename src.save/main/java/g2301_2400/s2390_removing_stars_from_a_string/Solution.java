package g2301_2400.s2390_removing_stars_from_a_string;

// #Medium #String #Stack #Simulation #2022_09_02_Time_31_ms_(90.55%)_Space_62.6_MB_(76.40%)

public class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int stars = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == '*') {
                ++stars;
            } else if (stars > 0) {
                --stars;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}
