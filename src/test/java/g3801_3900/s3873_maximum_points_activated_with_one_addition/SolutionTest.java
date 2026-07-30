package g3801_3900.s3873_maximum_points_activated_with_one_addition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxActivated() {
        assertThat(new Solution().maxActivated(new int[][] {{1, 1}, {1, 2}, {2, 2}}), equalTo(4));
    }

    @Test
    void maxActivated2() {
        assertThat(new Solution().maxActivated(new int[][] {{2, 2}, {1, 1}, {3, 3}}), equalTo(3));
    }

    @Test
    void maxActivated3() {
        assertThat(
                new Solution().maxActivated(new int[][] {{2, 3}, {2, 2}, {1, 1}, {4, 5}}),
                equalTo(4));
    }

    @Test
    void maxActivated4() {
        assertThat(new Solution().maxActivated(new int[][] {{1, 1}}), equalTo(2));
    }

    @Test
    void maxActivated5() {
        assertThat(new Solution().maxActivated(new int[][] {{1, 1}, {2, 2}}), equalTo(3));
    }

    @Test
    void maxActivated6() {
        assertThat(new Solution().maxActivated(new int[][] {{1, 1}, {1, 2}}), equalTo(3));
    }

    @Test
    void maxActivated7() {
        assertThat(new Solution().maxActivated(new int[][] {{1, 1}, {2, 1}}), equalTo(3));
    }

    @Test
    void maxActivated8() {
        assertThat(
                new Solution().maxActivated(new int[][] {{1, 1}, {1, 2}, {1, 3}, {1, 4}}),
                equalTo(5));
    }

    @Test
    void maxActivated9() {
        assertThat(
                new Solution().maxActivated(new int[][] {{1, 1}, {1, 2}, {5, 5}, {5, 6}}),
                equalTo(5));
    }

    @Test
    void maxActivated10() {
        assertThat(
                new Solution()
                        .maxActivated(new int[][] {{1, 1}, {1, 2}, {2, 2}, {3, 3}, {3, 4}, {4, 4}}),
                equalTo(7));
    }

    @Test
    void maxActivated11() {
        assertThat(
                new Solution().maxActivated(new int[][] {{1, 1}, {2, 2}, {3, 3}, {4, 4}}),
                equalTo(3));
    }

    @Test
    void maxActivated12() {
        assertThat(
                new Solution().maxActivated(new int[][] {{10, 10}, {10, 20}, {20, 20}, {20, 10}}),
                equalTo(5));
    }
}
