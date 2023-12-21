package g1401_1500.s1422_maximum_score_after_splitting_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(new Solution().maxScore("011101"), equalTo(5));
    }

    @Test
    void maxScore2() {
        assertThat(new Solution().maxScore("00111"), equalTo(5));
    }

    @Test
    void maxScore3() {
        assertThat(new Solution().maxScore("1111"), equalTo(3));
    }
}
