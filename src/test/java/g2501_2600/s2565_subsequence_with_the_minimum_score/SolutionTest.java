package g2501_2600.s2565_subsequence_with_the_minimum_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumScore() {
        assertThat(new Solution().minimumScore("abacaba", "bzaa"), equalTo(1));
    }

    @Test
    void minimumScore2() {
        assertThat(new Solution().minimumScore("cde", "xyz"), equalTo(3));
    }
}
