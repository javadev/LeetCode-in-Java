package g3601_3700.s3615_longest_palindromic_path_in_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxLen() {
        assertThat(new Solution().maxLen(3, new int[][] {{0, 1}, {1, 2}}, "aba"), equalTo(3));
    }

    @Test
    void maxLen2() {
        assertThat(new Solution().maxLen(3, new int[][] {{0, 1}, {0, 2}}, "abc"), equalTo(1));
    }

    @Test
    void maxLen3() {
        assertThat(
                new Solution().maxLen(4, new int[][] {{0, 2}, {0, 3}, {3, 1}}, "bbac"), equalTo(3));
    }
}
