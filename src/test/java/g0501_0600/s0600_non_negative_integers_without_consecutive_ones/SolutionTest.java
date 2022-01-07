package g0501_0600.s0600_non_negative_integers_without_consecutive_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findIntegers() {
        assertThat(new Solution().findIntegers(5), equalTo(5));
    }

    @Test
    void findIntegers2() {
        assertThat(new Solution().findIntegers(100000000), equalTo(514229));
    }
}
