package g3201_3300.s3281_maximize_score_of_numbers_in_ranges;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPossibleScore() {
        assertThat(new Solution().maxPossibleScore(new int[] {6, 0, 3}, 2), equalTo(4));
    }

    @Test
    void maxPossibleScore2() {
        assertThat(new Solution().maxPossibleScore(new int[] {2, 6, 13, 13}, 5), equalTo(5));
    }
}
