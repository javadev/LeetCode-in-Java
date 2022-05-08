package g0001_0100.s0093_restore_ip_addresses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void restoreIpAddresses() {
        assertThat(
                new Solution().restoreIpAddresses("25525511135").toString(),
                equalTo("[255.255.11.135, 255.255.111.35]"));
    }

    @Test
    void restoreIpAddresses2() {
        assertThat(new Solution().restoreIpAddresses("0000").toString(), equalTo("[0.0.0.0]"));
    }

    @Test
    void restoreIpAddresses3() {
        assertThat(
                new Solution().restoreIpAddresses("101023").toString(),
                equalTo("[1.0.10.23, 1.0.102.3, 10.1.0.23, 10.10.2.3, 101.0.2.3]"));
    }
}
