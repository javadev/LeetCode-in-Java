package g2601_2700.s2612_minimum_reverse_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minReverseOperations() {
        assertThat(
                new Solution().minReverseOperations(4, 0, new int[] {1, 2}, 4),
                equalTo(new int[] {0, -1, -1, 1}));
    }

    @Test
    void minReverseOperations2() {
        assertThat(
                new Solution().minReverseOperations(5, 0, new int[] {2, 4}, 3),
                equalTo(new int[] {0, -1, -1, -1, -1}));
    }
}
