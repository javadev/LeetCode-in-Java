package g0901_1000.s0948_bag_of_tokens;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bagOfTokensScore() {
        assertThat(new Solution().bagOfTokensScore(new int[] {100, 200}, 150), equalTo(1));
    }

    @Test
    void bagOfTokensScore2() {
        assertThat(
                new Solution().bagOfTokensScore(new int[] {100, 200, 300, 400}, 200), equalTo(2));
    }
}
