package g2101_2200.s2155_all_divisions_with_the_highest_score_of_a_binary_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScoreIndices() {
        assertThat(
                new Solution().maxScoreIndices(new int[] {0, 0, 1, 0}),
                equalTo(Arrays.asList(2, 4)));
    }

    @Test
    void maxScoreIndices2() {
        assertThat(new Solution().maxScoreIndices(new int[] {0, 0, 0}), equalTo(Arrays.asList(3)));
    }

    @Test
    void maxScoreIndices3() {
        assertThat(new Solution().maxScoreIndices(new int[] {1, 1}), equalTo(Arrays.asList(0)));
    }
}
