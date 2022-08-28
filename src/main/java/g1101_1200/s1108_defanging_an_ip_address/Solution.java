package g1101_1200.s1108_defanging_an_ip_address;

// #Easy #String #2022_02_28_Time_0_ms_(100.00%)_Space_42.6_MB_(5.79%)

public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
