package g1101_1200.s1189_maximum_number_of_balloons;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNumberOfBalloons() {
        assertThat(new Solution().maxNumberOfBalloons("nlaebolko"), equalTo(1));
    }

    @Test
    void maxNumberOfBalloons2() {
        assertThat(new Solution().maxNumberOfBalloons("loonbalxballpoon"), equalTo(2));
    }

    @Test
    void maxNumberOfBalloons3() {
        assertThat(new Solution().maxNumberOfBalloons("leetcode"), equalTo(0));
    }
}
