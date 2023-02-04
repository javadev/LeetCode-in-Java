package g1501_1600.s1505_minimum_possible_integer_after_at_most_k_adjacent_swaps_on_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minInteger() {
        assertThat(new Solution().minInteger("4321", 4), equalTo("1342"));
    }

    @Test
    void minInteger2() {
        assertThat(new Solution().minInteger("100", 1), equalTo("010"));
    }

    @Test
    void minInteger3() {
        assertThat(new Solution().minInteger("36789", 1000), equalTo("36789"));
    }
}
