package g3901_4000.s3942_minimum_operations_to_sort_a_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[] {0, 2, 1}), equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[] {1, 0, 2}), equalTo(2));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[] {2, 0, 1, 3}), equalTo(-1));
    }

    @Test
    void minOperations4() {
        assertThat(new Solution().minOperations(new int[] {0}), equalTo(0));
    }

    @Test
    void minOperations5() {
        assertThat(new Solution().minOperations(new int[] {0, 1, 2, 3}), equalTo(0));
    }

    @Test
    void minOperations6() {
        assertThat(new Solution().minOperations(new int[] {3, 2, 1, 0}), equalTo(1));
    }

    @Test
    void minOperations7() {
        assertThat(new Solution().minOperations(new int[] {3, 0, 1, 2}), equalTo(1));
    }

    @Test
    void minOperations8() {
        assertThat(new Solution().minOperations(new int[] {1, 2, 3, 4, 5, 0}), equalTo(3));
    }

    @Test
    void minOperations9() {
        assertThat(new Solution().minOperations(new int[] {0, 5, 4, 3, 2, 1}), equalTo(2));
    }
}
