package g3201_3300.s3288_length_of_the_longest_increasing_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPathLength() {
        assertThat(
                new Solution()
                        .maxPathLength(new int[][] {{3, 1}, {2, 2}, {4, 1}, {0, 0}, {5, 3}}, 1),
                equalTo(3));
    }

    @Test
    void maxPathLength2() {
        assertThat(
                new Solution().maxPathLength(new int[][] {{2, 1}, {7, 0}, {5, 6}}, 2), equalTo(2));
    }
}
