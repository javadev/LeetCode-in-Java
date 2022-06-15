package g2201_2300.s2264_largest_3_same_digit_number_in_string;

// #2022_06_15_Time_4_ms_(61.36%)_Space_43_MB_(45.33%)

public class Solution {
    public String largestGoodInteger(String num) {
        String largest = "";
        for (int i = 0; i + 2 < num.length(); i++)
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                String subNum = num.substring(i, i + 3);
                if (subNum.compareTo(largest) > 0) {
                    largest = subNum;
                }
            }
        return largest;
    }
}
