package g3601_3700.s3634_minimum_removals_to_balance_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minRemoval() {
        assertThat(new Solution().minRemoval(new int[] {2, 1, 5}, 2), equalTo(1));
    }

    @Test
    void minRemoval2() {
        assertThat(new Solution().minRemoval(new int[] {1, 6, 2, 9}, 3), equalTo(2));
    }

    @Test
    void minRemoval3() {
        assertThat(new Solution().minRemoval(new int[] {4, 6}, 2), equalTo(0));
    }
}
