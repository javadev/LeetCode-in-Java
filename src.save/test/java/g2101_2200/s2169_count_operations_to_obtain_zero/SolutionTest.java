package g2101_2200.s2169_count_operations_to_obtain_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOperations() {
        assertThat(new Solution().countOperations(2, 3), equalTo(3));
    }

    @Test
    void countOperations2() {
        assertThat(new Solution().countOperations(10, 10), equalTo(1));
    }
}
