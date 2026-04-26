package g3701_3800.s3751_total_waviness_of_numbers_in_range_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalWaviness() {
        assertThat(new Solution().totalWaviness(120, 130), equalTo(3));
    }

    @Test
    void totalWaviness2() {
        assertThat(new Solution().totalWaviness(198, 202), equalTo(3));
    }

    @Test
    void totalWaviness3() {
        assertThat(new Solution().totalWaviness(4848, 4848), equalTo(2));
    }
}
