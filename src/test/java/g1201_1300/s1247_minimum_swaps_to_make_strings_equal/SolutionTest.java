package g1201_1300.s1247_minimum_swaps_to_make_strings_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSwap() {
        assertThat(new Solution().minimumSwap("xx", "yy"), equalTo(1));
    }

    @Test
    void minimumSwap2() {
        assertThat(new Solution().minimumSwap("xy", "yx"), equalTo(2));
    }

    @Test
    void minimumSwap3() {
        assertThat(new Solution().minimumSwap("xx", "xy"), equalTo(-1));
    }
}
