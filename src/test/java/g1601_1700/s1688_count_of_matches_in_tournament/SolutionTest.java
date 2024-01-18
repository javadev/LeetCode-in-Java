package g1601_1700.s1688_count_of_matches_in_tournament;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfMatches() {
        assertThat(new Solution().numberOfMatches(7), equalTo(6));
    }

    @Test
    void numberOfMatches2() {
        assertThat(new Solution().numberOfMatches(14), equalTo(13));
    }
}
