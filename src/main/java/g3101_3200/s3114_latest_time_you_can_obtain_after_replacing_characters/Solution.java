package g3101_3200.s3114_latest_time_you_can_obtain_after_replacing_characters;

// #Easy #String #Enumeration #2024_04_27_Time_1_ms_(100.00%)_Space_42.5_MB_(85.42%)

public class Solution {
    public String findLatestTime(String s) {
        StringBuilder nm = new StringBuilder();
        if (s.charAt(0) == '?' && s.charAt(1) == '?') {
            nm.append("11");
        } else if (s.charAt(0) != '?' && s.charAt(1) == '?') {
            nm.append(s.charAt(0));
            if (s.charAt(0) == '1') {
                nm.append("1");
            } else {
                nm.append("9");
            }
        } else if (s.charAt(0) == '?' && s.charAt(1) != '?') {
            if (s.charAt(1) >= '2' && s.charAt(1) <= '9') {
                nm.append("0");
            } else {
                nm.append("1");
            }
            nm.append(s.charAt(1));
        } else {
            nm.append(s.charAt(0));
            nm.append(s.charAt(1));
        }
        nm.append(":");
        if (s.charAt(3) == '?' && s.charAt(4) == '?') {
            nm.append("59");
        } else if (s.charAt(3) != '?' && s.charAt(4) == '?') {
            nm.append(s.charAt(3));
            nm.append("9");
        } else if (s.charAt(3) == '?' && s.charAt(4) != '?') {
            nm.append("5");
            nm.append(s.charAt(4));
        } else {
            nm.append(s.charAt(3));
            nm.append(s.charAt(4));
        }
        return nm.toString();
    }
}
