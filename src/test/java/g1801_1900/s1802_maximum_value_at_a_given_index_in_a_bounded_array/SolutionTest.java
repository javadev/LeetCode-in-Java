package g1801_1900.s1802_maximum_value_at_a_given_index_in_a_bounded_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValue() {
        assertThat(new Solution().maxValue(4, 2, 6), equalTo(2));
    }

    @Test
    void maxValue2() {
        assertThat(new Solution().maxValue(6, 1, 10), equalTo(3));
    }
}
