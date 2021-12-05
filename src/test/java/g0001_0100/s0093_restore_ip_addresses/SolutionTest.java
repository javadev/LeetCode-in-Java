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
}
