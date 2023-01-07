package g1901_2000.s1959_minimum_total_space_wasted_with_k_resizing_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkMove() {
        assertThat(new Solution().minSpaceWastedKResizing(new int[] {10, 20}, 0), equalTo(10));
    }

    @Test
    void checkMove2() {
        assertThat(new Solution().minSpaceWastedKResizing(new int[] {10, 20, 30}, 1), equalTo(10));
    }

    @Test
    void checkMove3() {
        assertThat(
                new Solution().minSpaceWastedKResizing(new int[] {10, 20, 15, 30, 20}, 2),
                equalTo(15));
    }
}
