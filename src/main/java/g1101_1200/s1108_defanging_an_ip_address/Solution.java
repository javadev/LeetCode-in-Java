package g1101_1200.s1108_defanging_an_ip_address;

// #Easy #String #2022_02_28_Time_3_ms_(26.20%)_Space_42.8_MB_(5.79%)

public class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "\\[\\.\\]");
    }
}
