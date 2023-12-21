package g1901_2000.s1943_describe_the_painting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitPainting() {
        assertThat(
                new Solution().splitPainting(new int[][] {{1, 4, 5}, {4, 7, 7}, {1, 7, 9}}),
                equalTo(Arrays.asList(Arrays.asList(1L, 4L, 14L), Arrays.asList(4L, 7L, 16L))));
    }

    @Test
    void splitPainting2() {
        assertThat(
                new Solution().splitPainting(new int[][] {{1, 7, 9}, {6, 8, 15}, {8, 10, 7}}),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(1L, 6L, 9L),
                                Arrays.asList(6L, 7L, 24L),
                                Arrays.asList(7L, 8L, 15L),
                                Arrays.asList(8L, 10L, 7L))));
    }

    @Test
    void splitPainting3() {
        assertThat(
                new Solution()
                        .splitPainting(new int[][] {{1, 4, 5}, {1, 4, 7}, {4, 7, 1}, {4, 7, 11}}),
                equalTo(Arrays.asList(Arrays.asList(1L, 4L, 12L), Arrays.asList(4L, 7L, 12L))));
    }
}
