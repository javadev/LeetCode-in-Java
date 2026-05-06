package g3701_3800.s3781_maximum_score_after_binary_swaps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScore() {
        assertThat(new Solution().maximumScore(new int[] {2, 1, 5, 2, 3}, "01010"), equalTo(7));
    }

    @Test
    void maximumScore2() {
        assertThat(new Solution().maximumScore(new int[] {4, 7, 2, 9}, "0000"), equalTo(0));
    }
}
