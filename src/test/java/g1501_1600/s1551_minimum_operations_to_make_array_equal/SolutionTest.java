package g1501_1600.s1551_minimum_operations_to_make_array_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(3), equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(6), equalTo(9));
    }
}
