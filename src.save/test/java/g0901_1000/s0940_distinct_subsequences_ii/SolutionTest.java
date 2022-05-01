package g0901_1000.s0940_distinct_subsequences_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctSubseqII() {
        assertThat(new Solution().distinctSubseqII("abc"), equalTo(7));
    }

    @Test
    void distinctSubseqII2() {
        assertThat(new Solution().distinctSubseqII("aba"), equalTo(6));
    }

    @Test
    void distinctSubseqII3() {
        assertThat(new Solution().distinctSubseqII("aaa"), equalTo(3));
    }
}
