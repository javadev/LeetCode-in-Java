package g2801_2900.s2869_minimum_operations_to_collect_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(Arrays.asList(3, 1, 5, 4, 2), 2), equalTo(4));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(Arrays.asList(3, 1, 5, 4, 2), 5), equalTo(5));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(Arrays.asList(3, 2, 5, 3, 1), 3), equalTo(4));
    }
}
