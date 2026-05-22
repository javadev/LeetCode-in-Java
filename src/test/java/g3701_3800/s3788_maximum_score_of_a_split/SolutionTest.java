package g3701_3800.s3788_maximum_score_of_a_split;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScore() {
        assertThat(new Solution().maximumScore(new int[] {10, -1, 3, -4, -5}), equalTo(17L));
    }

    @Test
    void maximumScore2() {
        assertThat(new Solution().maximumScore(new int[] {-7, -5, 3}), equalTo(-2L));
    }

    @Test
    void maximumScore3() {
        assertThat(new Solution().maximumScore(new int[] {1, 1}), equalTo(0L));
    }
}
