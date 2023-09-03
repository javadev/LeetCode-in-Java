package g1601_1700.s1694_reformat_phone_number;

// #Easy #String #2022_04_13_Time_1_ms_(99.67%)_Space_40.7_MB_(88.24%)

@SuppressWarnings("java:S135")
public class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        String cleaned = sb.toString();
        sb.setLength(0);
        int i = 0;
        while (i < cleaned.length()) {
            if (i + 4 == cleaned.length()) {
                sb.append(cleaned, i, i + 2);
                sb.append("-");
                sb.append(cleaned.substring(i + 2));
                break;
            } else if (i + 3 <= cleaned.length()) {
                sb.append(cleaned, i, i + 3);
                sb.append("-");
                i += 3;
            } else {
                sb.append(cleaned.substring(i));
                break;
            }
        }
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
