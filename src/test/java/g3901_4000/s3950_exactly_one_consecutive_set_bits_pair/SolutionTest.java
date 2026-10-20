package g3901_4000.s3950_exactly_one_consecutive_set_bits_pair;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void consecutiveSetBits() {
        assertThat(new Solution().consecutiveSetBits(6), equalTo(true));
    }

    @Test
    void consecutiveSetBits2() {
        assertThat(new Solution().consecutiveSetBits(5), equalTo(false));
    }
}
