package g3901_4000.s3937_minimum_operations_to_make_array_modulo_alternating_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {1, 4, 2, 8}, 3), equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {1, 1, 1}, 3), equalTo(1));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {1000000000}, 100), equalTo(0));
    }

    @Test
    void minOperations4() {
        assertThat(new Solution().minOperations(new int[] {1, 2, 3, 4}, 2), equalTo(0));
    }

    @Test
    void minOperations5() {
        assertThat(new Solution().minOperations(new int[] {2, 2, 2, 2}, 2), equalTo(2));
    }

    @Test
    void minOperations6() {
        assertThat(new Solution().minOperations(new int[] {1, 5, 1, 4}, 5), equalTo(1));
    }
}
