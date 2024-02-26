package g0901_1000.s0926_flip_string_to_monotone_increasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minFlipsMonoIncr() {
        assertThat(new Solution().minFlipsMonoIncr("00110"), equalTo(1));
    }

    @Test
    void minFlipsMonoIncr2() {
        assertThat(new Solution().minFlipsMonoIncr("010110"), equalTo(2));
    }

    @Test
    void minFlipsMonoIncr3() {
        assertThat(new Solution().minFlipsMonoIncr("00011000"), equalTo(2));
    }
}
