package g3901_4000.s3945_digit_frequency_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void digitFrequencyScore() {
        assertThat(new Solution().digitFrequencyScore(122), equalTo(5));
    }

    @Test
    void digitFrequencyScore2() {
        assertThat(new Solution().digitFrequencyScore(101), equalTo(2));
    }

    @Test
    void digitFrequencyScore3() {
        assertThat(new Solution().digitFrequencyScore(1), equalTo(1));
    }

    @Test
    void digitFrequencyScore4() {
        assertThat(new Solution().digitFrequencyScore(999999999), equalTo(81));
    }

    @Test
    void digitFrequencyScore5() {
        assertThat(new Solution().digitFrequencyScore(1000000000), equalTo(1));
    }

    @Test
    void digitFrequencyScore6() {
        assertThat(new Solution().digitFrequencyScore(987654321), equalTo(45));
    }
}
