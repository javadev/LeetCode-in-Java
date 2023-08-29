package g1801_1900.s1834_single_threaded_cpu;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getOrder() {
        assertThat(
                new Solution().getOrder(new int[][] {{1, 2}, {2, 4}, {3, 2}, {4, 1}}),
                equalTo(new int[] {0, 2, 3, 1}));
    }

    @Test
    void getOrder2() {
        assertThat(
                new Solution().getOrder(new int[][] {{7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}}),
                equalTo(new int[] {4, 3, 2, 0, 1}));
    }
}
