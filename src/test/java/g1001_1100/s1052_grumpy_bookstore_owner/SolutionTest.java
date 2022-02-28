package g1001_1100.s1052_grumpy_bookstore_owner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSatisfied() {
        assertThat(
                new Solution()
                        .maxSatisfied(
                                new int[] {1, 0, 1, 2, 1, 1, 7, 5},
                                new int[] {0, 1, 0, 1, 0, 1, 0, 1},
                                3),
                equalTo(16));
    }

    @Test
    void maxSatisfied2() {
        assertThat(new Solution().maxSatisfied(new int[] {1}, new int[] {0}, 3), equalTo(1));
    }
}
