package g2501_2600.s2525_categorize_box_according_to_criteria;

// #Easy #Math #2023_04_19_Time_0_ms_(100.00%)_Space_40.1_MB_(36.65%)

public class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long) length * width * height;
        boolean b = false;
        boolean h = false;
        if (length >= 10000 || width >= 10000 || height >= 10000 || vol >= 1000000000) {
            b = true;
        }
        if (mass >= 100) {
            h = true;
        }
        if (b && h) {
            return "Both";
        } else if (!b && !h) {
            return "Neither";
        } else if (b) {
            return "Bulky";
        } else {
            return "Heavy";
        }
    }
}
