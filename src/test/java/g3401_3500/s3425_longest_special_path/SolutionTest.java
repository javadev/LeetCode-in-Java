package g3401_3500.s3425_longest_special_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSpecialPath() {
        assertThat(
                new Solution()
                        .longestSpecialPath(
                                new int[][] {{0, 1, 2}, {1, 2, 3}, {1, 3, 5}, {1, 4, 4}, {2, 5, 6}},
                                new int[] {2, 1, 2, 1, 3, 1}),
                equalTo(new int[] {6, 2}));
    }

    @Test
    void longestSpecialPath2() {
        assertThat(
                new Solution().longestSpecialPath(new int[][] {{1, 0, 8}}, new int[] {2, 2}),
                equalTo(new int[] {0, 1}));
    }
}
