package g3701_3800.s3707_equal_score_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void scoreBalance() {
        assertThat(new Solution().scoreBalance("adcb"), equalTo(true));
    }

    @Test
    void scoreBalance2() {
        assertThat(new Solution().scoreBalance("bace"), equalTo(false));
    }
}
