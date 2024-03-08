package g2901_3000.s2996_smallest_missing_integer_greater_than_sequential_prefix_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void missingInteger() {
        assertThat(new Solution().missingInteger(new int[] {1, 2, 3, 2, 5}), equalTo(6));
    }

    @Test
    void missingInteger2() {
        assertThat(new Solution().missingInteger(new int[] {3, 4, 5, 1, 12, 14, 13}), equalTo(15));
    }
}
