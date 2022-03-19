package g1301_1400.s1318_minimum_flips_to_make_a_or_b_equal_to_c;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minFlips() {
        assertThat(new Solution().minFlips(2, 6, 5), equalTo(3));
    }

    @Test
    void minFlips2() {
        assertThat(new Solution().minFlips(4, 2, 7), equalTo(1));
    }

    @Test
    void minFlips3() {
        assertThat(new Solution().minFlips(1, 2, 3), equalTo(0));
    }
}
