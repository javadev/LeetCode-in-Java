package g3201_3300.s3280_convert_date_to_binary;

// #Easy #2024_09_09_Time_3_ms_(100.00%)_Space_42.4_MB_(50.00%)

public class Solution {
    private String helper(String str) {
        return Integer.toBinaryString(Integer.parseInt(str));
    }

    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        for (String str : date.split("-")) {
            sb.append(helper(str));
            sb.append("-");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
