package g2401_2500.s2467_most_profitable_path_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostProfitablePath() {
        assertThat(
                new Solution()
                        .mostProfitablePath(
                                new int[][] {{0, 1}, {1, 2}, {1, 3}, {3, 4}},
                                3,
                                new int[] {-2, 4, 2, -4, 6}),
                equalTo(6));
    }

    @Test
    void mostProfitablePath2() {
        assertThat(
                new Solution().mostProfitablePath(new int[][] {{0, 1}}, 1, new int[] {-7280, 2350}),
                equalTo(-7280));
    }
}
