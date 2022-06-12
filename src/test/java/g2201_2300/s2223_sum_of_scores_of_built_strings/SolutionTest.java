package g2201_2300.s2223_sum_of_scores_of_built_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumScores() {
        assertThat(new Solution().sumScores("babab"), equalTo(9L));
    }

    @Test
    void sumScores2() {
        assertThat(new Solution().sumScores("azbazbzaz"), equalTo(14L));
    }
}
