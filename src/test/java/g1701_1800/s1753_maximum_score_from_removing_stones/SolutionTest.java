package g1701_1800.s1753_maximum_score_from_removing_stones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScore() {
        assertThat(new Solution().maximumScore(2, 4, 6), equalTo(6));
    }

    @Test
    void maximumScore2() {
        assertThat(new Solution().maximumScore(4, 4, 6), equalTo(7));
    }

    @Test
    void maximumScore3() {
        assertThat(new Solution().maximumScore(1, 8, 8), equalTo(8));
    }
}
