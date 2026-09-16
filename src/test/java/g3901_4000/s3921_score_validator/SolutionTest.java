package g3901_4000.s3921_score_validator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void scoreValidator() {
        assertThat(
                new Solution().scoreValidator(new String[] {"1", "4", "W", "6", "WD"}),
                equalTo(new int[] {12, 1}));
    }

    @Test
    void scoreValidator2() {
        assertThat(
                new Solution().scoreValidator(new String[] {"WD", "NB", "0", "4", "4"}),
                equalTo(new int[] {10, 0}));
    }

    @Test
    void scoreValidator3() {
        assertThat(
                new Solution()
                        .scoreValidator(
                                new String[] {
                                    "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W"
                                }),
                equalTo(new int[] {0, 10}));
    }
}
