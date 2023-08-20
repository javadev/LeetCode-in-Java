package g2101_2200.s2177_find_three_consecutive_integers_that_sum_to_a_given_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfThree() {
        assertThat(new Solution().sumOfThree(33L), equalTo(new long[] {10, 11, 12}));
    }

    @Test
    void sumOfThree2() {
        assertThat(new Solution().sumOfThree(4L), equalTo(new long[0]));
    }
}
