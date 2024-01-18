package g2001_2100.s2009_minimum_number_of_operations_to_make_array_continuous;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {4, 2, 5, 3}), equalTo(0));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {1, 2, 3, 5, 6}), equalTo(1));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {1, 10, 100, 1000}), equalTo(3));
    }
}
