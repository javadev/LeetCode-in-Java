package g0401_0500.s0468_validate_ip_address;

// #Medium #String

public class Solution {
    private static final String NEITHER = "Neither";
    public String validIPAddress(String ip) {
        if (ip.length() == 0) {
            return NEITHER;
        }
        String[] arr = ip.split("\\.", -1);
        String[] arr1 = ip.split(":", -1);
        if (arr.length == 4) {
            for (String num : arr) {
                try {
                    if ((num.length() > 1 && num.startsWith("0")) || Integer.parseInt(num) > 255) {
                        return NEITHER;
                    }
                } catch (Exception e) {
                    return NEITHER;
                }
            }
            return "IPv4";
        } else if (arr1.length == 8) {
            for (String num : arr1) {
                if (num.length() < 1 || num.length() > 4) {
                    return NEITHER;
                }
                for (int j = 0; j < num.length(); j++) {
                    char ch = num.charAt(j);
                    if(ch>9){
                        if (Character.isLowerCase(ch) && ch > 'f') {
                            return NEITHER;
                        } else if (Character.isUpperCase(ch) && ch > 'F') {
                            return NEITHER;
                        }
                    }
                }
            }
            return "IPv6";
        }
        return NEITHER;
    }
}
