package g3501_3600.s3600_maximize_spanning_tree_stability_with_upgrades;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxStability() {
        assertThat(
                new Solution().maxStability(3, new int[][] {{0, 1, 2, 1}, {1, 2, 3, 0}}, 1),
                equalTo(2));
    }

    @Test
    void maxStability2() {
        assertThat(
                new Solution()
                        .maxStability(3, new int[][] {{0, 1, 4, 0}, {1, 2, 3, 0}, {0, 2, 1, 0}}, 2),
                equalTo(6));
    }

    @Test
    void maxStability3() {
        assertThat(
                new Solution()
                        .maxStability(3, new int[][] {{0, 1, 1, 1}, {1, 2, 1, 1}, {2, 0, 1, 1}}, 0),
                equalTo(-1));
    }
}
