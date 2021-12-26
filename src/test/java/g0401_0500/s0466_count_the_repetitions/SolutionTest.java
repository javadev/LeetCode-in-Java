package g0401_0500.s0466_count_the_repetitions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMaxRepetitions() {
        assertThat(new Solution().getMaxRepetitions("acb", 4, "ab", 2), equalTo(2));
    }

    @Test
    void getMaxRepetitions2() {
        assertThat(new Solution().getMaxRepetitions("acb", 1, "acb", 1), equalTo(1));
    }
}
