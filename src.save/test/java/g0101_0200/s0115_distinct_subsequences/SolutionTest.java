package g0101_0200.s0115_distinct_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numDistinct() {
        assertThat(new Solution().numDistinct("rabbbit", "rabbit"), equalTo(3));
    }

    @Test
    void numDistinct2() {
        assertThat(new Solution().numDistinct("babgbag", "bag"), equalTo(5));
    }
}
