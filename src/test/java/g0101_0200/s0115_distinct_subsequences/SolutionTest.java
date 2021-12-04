package g0101_0200.s0115_distinct_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctSubsequences() {
        assertThat(new Solution().numDistinct("rabbbit", "rabbit"), equalTo(3));
    }
}
