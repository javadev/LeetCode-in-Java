package g0401_0500.s0468_validate_ip_address;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validIPAddress() {
        assertThat(new Solution().validIPAddress("172.16.254.1"), equalTo("IPv4"));
    }

    @Test
    void validIPAddress2() {
        assertThat(
                new Solution().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"),
                equalTo("IPv6"));
    }

    @Test
    void validIPAddress3() {
        assertThat(new Solution().validIPAddress("256.256.256.256"), equalTo("Neither"));
    }
}
