package g0301_0400.s0354_russian_doll_envelopes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testMaxEnvelopes() {
        assertThat(
                new Solution().maxEnvelopes(new int[][] {{5, 4}, {6, 4}, {6, 7}, {2, 3}}),
                equalTo(3));
    }

    @Test
    void testMaxEnvelopes2() {
        assertThat(new Solution().maxEnvelopes(new int[][] {{1, 1}, {1, 1}, {1, 1}}), equalTo(1));
    }
}
