package g3701_3800.s3800_minimum_cost_to_make_two_binary_strings_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(new Solution().minimumCost("01000", "10111", 10, 2, 2), equalTo(16L));
    }

    @Test
    void minimumCost2() {
        assertThat(new Solution().minimumCost("001", "110", 2, 100, 100), equalTo(6L));
    }

    @Test
    void minimumCost3() {
        assertThat(new Solution().minimumCost("1010", "1010", 5, 5, 5), equalTo(0L));
    }
}
