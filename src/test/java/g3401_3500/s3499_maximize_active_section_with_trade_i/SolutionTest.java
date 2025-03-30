package g3401_3500.s3499_maximize_active_section_with_trade_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxActiveSectionsAfterTrade() {
        assertThat(new Solution().maxActiveSectionsAfterTrade("01"), equalTo(1));
    }

    @Test
    void maxActiveSectionsAfterTrade2() {
        assertThat(new Solution().maxActiveSectionsAfterTrade("0100"), equalTo(4));
    }

    @Test
    void maxActiveSectionsAfterTrade3() {
        assertThat(new Solution().maxActiveSectionsAfterTrade("1000100"), equalTo(7));
    }

    @Test
    void maxActiveSectionsAfterTrade4() {
        assertThat(new Solution().maxActiveSectionsAfterTrade("01010"), equalTo(4));
    }
}
