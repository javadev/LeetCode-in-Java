package g3901_4000.s3953_maximum_score_with_co_prime_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(new Solution().maxScore(new int[] {3, 4, 6}, 5), equalTo(4));
    }

    @Test
    void maxScore2() {
        assertThat(new Solution().maxScore(new int[] {1, 2, 3}, 4), equalTo(3));
    }

    @Test
    void maxScore3() {
        assertThat(new Solution().maxScore(new int[] {2, 2}, 1), equalTo(1));
    }
}
