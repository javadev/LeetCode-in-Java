package g0601_0700.s0693_binary_number_with_alternating_bits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasAlternatingBits() {
        assertThat(new Solution().hasAlternatingBits(5), equalTo(true));
    }

    @Test
    void hasAlternatingBits2() {
        assertThat(new Solution().hasAlternatingBits(7), equalTo(false));
    }

    @Test
    void hasAlternatingBits3() {
        assertThat(new Solution().hasAlternatingBits(11), equalTo(false));
    }
}
