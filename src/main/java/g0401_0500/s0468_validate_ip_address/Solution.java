package g0401_0500.s0468_validate_ip_address;

// #Medium #String

public class Solution {
    public String validIPAddress(String IP) {
        if (IP.length() == 0) {
            return "Neither";
        }
        String[] arr = IP.split("\\.", -1);
        String[] arr1 = IP.split(":", -1);
        if (arr.length == 4) {
            for (String num : arr) {
                try {
                    if ((num.length() > 1 && num.startsWith("0")) || Integer.parseInt(num) > 255) {
                        return "Neither";
                    }
                } catch (Exception e) {
                    return "Neither";
                }
            }
            return "IPv4";
        } else if (arr1.length == 8) {
            for (String num : arr1) {
                if (num.length() < 1 || num.length() > 4) {
                    return "Neither";
                }
                for (int j = 0; j < num.length(); j++) {
                    char ch = num.charAt(j);
                    if (ch >= 0 && ch <= 9) {
                        continue;
                    } else if (Character.isLowerCase(ch) && ch > 'f') {
                        return "Neither";
                    } else if (Character.isUpperCase(ch) && ch > 'F') {
                        return "Neither";
                    }
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}
