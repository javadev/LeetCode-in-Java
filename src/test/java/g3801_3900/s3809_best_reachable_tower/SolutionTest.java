package g3801_3900.s3809_best_reachable_tower;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bestTower() {
        assertThat(
                new Solution()
                        .bestTower(
                                new int[][] {{1, 2, 5}, {2, 1, 7}, {3, 1, 9}}, new int[] {1, 1}, 2),
                equalTo(new int[] {3, 1}));
    }

    @Test
    void bestTower2() {
        assertThat(
                new Solution()
                        .bestTower(
                                new int[][] {{1, 3, 4}, {2, 2, 4}, {4, 4, 7}}, new int[] {0, 0}, 5),
                equalTo(new int[] {1, 3}));
    }

    @Test
    void bestTower3() {
        assertThat(
                new Solution().bestTower(new int[][] {{5, 6, 8}, {0, 3, 5}}, new int[] {1, 2}, 1),
                equalTo(new int[] {-1, -1}));
    }
}
