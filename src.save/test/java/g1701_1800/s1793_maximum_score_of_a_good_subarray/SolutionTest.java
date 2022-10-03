package g1701_1800.s1793_maximum_score_of_a_good_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScore() {
        assertThat(new Solution().maximumScore(new int[] {1, 4, 3, 7, 4, 5}, 3), equalTo(15));
    }

    @Test
    void maximumScore2() {
        assertThat(new Solution().maximumScore(new int[] {5, 5, 4, 5, 4, 1, 1, 1}, 0), equalTo(20));
    }
}
