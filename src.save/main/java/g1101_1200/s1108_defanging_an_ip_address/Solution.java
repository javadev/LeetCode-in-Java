package g1101_1200.s1108_defanging_an_ip_address;

// #Easy #String #2023_06_01_Time_0_ms_(100.00%)_Space_40.6_MB_(55.94%)

public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
