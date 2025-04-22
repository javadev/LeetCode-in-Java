package g3501_3600.s3522_calculate_score_after_performing_instructions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void calculateScore() {
        assertThat(
                new Solution()
                        .calculateScore(
                                new String[] {"jump", "add", "add", "jump", "add", "jump"},
                                new int[] {2, 1, 3, 1, -2, -3}),
                equalTo(1L));
    }

    @Test
    void calculateScore2() {
        assertThat(
                new Solution()
                        .calculateScore(new String[] {"jump", "add", "add"}, new int[] {3, 1, 1}),
                equalTo(0L));
    }

    @Test
    void calculateScore3() {
        assertThat(
                new Solution().calculateScore(new String[] {"jump"}, new int[] {0}), equalTo(0L));
    }
}
