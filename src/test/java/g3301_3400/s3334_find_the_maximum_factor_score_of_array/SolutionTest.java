package g3301_3400.s3334_find_the_maximum_factor_score_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(new Solution().maxScore(new int[] {2, 4, 8, 16}), equalTo(64L));
    }

    @Test
    void maxScore2() {
        assertThat(new Solution().maxScore(new int[] {1, 2, 3, 4, 5}), equalTo(60L));
    }

    @Test
    void maxScore3() {
        assertThat(new Solution().maxScore(new int[] {3}), equalTo(9L));
    }
}
