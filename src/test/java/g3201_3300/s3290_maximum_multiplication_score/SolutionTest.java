package g3201_3300.s3290_maximum_multiplication_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(
                new Solution()
                        .maxScore(new int[] {3, 2, 5, 6}, new int[] {2, -6, 4, -5, -3, 2, -7}),
                equalTo(26L));
    }

    @Test
    void maxScore2() {
        assertThat(
                new Solution().maxScore(new int[] {-1, 4, 5, -2}, new int[] {-5, -1, -3, -2, -4}),
                equalTo(-1L));
    }
}
