package g3701_3800.s3791_number_of_balanced_integers_in_a_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBalanced() {
        assertThat(new Solution().countBalanced(1, 100), equalTo(9L));
    }

    @Test
    void countBalanced2() {
        assertThat(new Solution().countBalanced(120, 129), equalTo(1L));
    }

    @Test
    void countBalanced3() {
        assertThat(new Solution().countBalanced(1234, 1234), equalTo(0L));
    }
}
