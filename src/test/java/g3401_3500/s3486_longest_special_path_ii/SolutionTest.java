package g3401_3500.s3486_longest_special_path_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSpecialPath() {
        assertThat(
                new Solution()
                        .longestSpecialPath(
                                new int[][] {
                                    {0, 1, 1}, {1, 2, 3}, {1, 3, 1}, {2, 4, 6}, {4, 7, 2},
                                    {3, 5, 2}, {3, 6, 5}, {6, 8, 3}
                                },
                                new int[] {1, 1, 0, 3, 1, 2, 1, 1, 0}),
                equalTo(new int[] {9, 3}));
    }

    @Test
    void longestSpecialPath2() {
        assertThat(
                new Solution()
                        .longestSpecialPath(
                                new int[][] {{1, 0, 3}, {0, 2, 4}, {0, 3, 5}},
                                new int[] {1, 1, 0, 2}),
                equalTo(new int[] {5, 2}));
    }

    @Test
    void longestSpecialPath3() {
        assertThat(
                new Solution()
                        .longestSpecialPath(
                                new int[][] {{0, 2, 4}, {1, 2, 10}, {3, 1, 5}},
                                new int[] {4, 5, 4, 5}),
                equalTo(new int[] {15, 3}));
    }
}
