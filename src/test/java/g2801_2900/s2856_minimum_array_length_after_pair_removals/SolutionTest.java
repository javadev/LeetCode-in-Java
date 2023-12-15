package g2801_2900.s2856_minimum_array_length_after_pair_removals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minLengthAfterRemovals() {
        assertThat(new Solution().minLengthAfterRemovals(Arrays.asList(1, 3, 4, 9)), equalTo(0));
    }

    @Test
    void minLengthAfterRemovals2() {
        assertThat(new Solution().minLengthAfterRemovals(Arrays.asList(2, 3, 6, 9)), equalTo(0));
    }

    @Test
    void minLengthAfterRemovals3() {
        assertThat(new Solution().minLengthAfterRemovals(Arrays.asList(1, 1, 2)), equalTo(1));
    }
}
