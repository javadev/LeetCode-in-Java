package g2501_2600.s2571_minimum_operations_to_reduce_an_integer_to_0;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(39), equalTo(3));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(54), equalTo(3));
    }
}
