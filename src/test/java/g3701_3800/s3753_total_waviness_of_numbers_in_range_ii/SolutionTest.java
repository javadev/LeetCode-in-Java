package g3701_3800.s3753_total_waviness_of_numbers_in_range_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalWaviness() {
        assertThat(new Solution().totalWaviness(120L, 130L), equalTo(3L));
    }

    @Test
    void totalWaviness2() {
        assertThat(new Solution().totalWaviness(198L, 202L), equalTo(3L));
    }

    @Test
    void totalWaviness3() {
        assertThat(new Solution().totalWaviness(4848L, 4848L), equalTo(2L));
    }
}
