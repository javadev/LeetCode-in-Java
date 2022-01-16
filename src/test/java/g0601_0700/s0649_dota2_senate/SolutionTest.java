package g0601_0700.s0649_dota2_senate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void predictPartyVictory() {
        assertThat(new Solution().predictPartyVictory("RD"), equalTo("Radiant"));
    }

    @Test
    void predictPartyVictory2() {
        assertThat(new Solution().predictPartyVictory("RDD"), equalTo("Dire"));
    }
}
