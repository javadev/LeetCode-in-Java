package g3901_4000.s4000_largest_integer_with_given_digit_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestInteger() {
        assertThat(new Solution().largestInteger(2, 9), equalTo(90));
    }

    @Test
    void largestInteger2() {
        assertThat(new Solution().largestInteger(2, 19), equalTo(-1));
    }

    @Test
    void largestInteger3() {
        assertThat(new Solution().largestInteger(5, 0), equalTo(0));
    }
}
