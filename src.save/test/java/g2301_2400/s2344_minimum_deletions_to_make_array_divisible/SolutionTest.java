package g2301_2400.s2344_minimum_deletions_to_make_array_divisible;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution().minOperations(new int[] {2, 3, 2, 4, 3}, new int[] {9, 6, 9, 3, 15}),
                equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution().minOperations(new int[] {4, 3, 6}, new int[] {8, 2, 6, 10}),
                equalTo(-1));
    }
}
