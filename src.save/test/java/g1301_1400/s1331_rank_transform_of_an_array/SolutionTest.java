package g1301_1400.s1331_rank_transform_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void arrayRankTransform() {
        assertThat(
                new Solution().arrayRankTransform(new int[] {40, 10, 20, 30}),
                equalTo(new int[] {4, 1, 2, 3}));
    }

    @Test
    void arrayRankTransform2() {
        assertThat(
                new Solution().arrayRankTransform(new int[] {100, 100, 100}),
                equalTo(new int[] {1, 1, 1}));
    }

    @Test
    void arrayRankTransform3() {
        assertThat(
                new Solution().arrayRankTransform(new int[] {37, 12, 28, 9, 100, 56, 80, 5, 12}),
                equalTo(new int[] {5, 3, 4, 2, 8, 6, 7, 1, 3}));
    }
}
