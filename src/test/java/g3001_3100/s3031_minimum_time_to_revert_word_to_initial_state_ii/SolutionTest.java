package g3001_3100.s3031_minimum_time_to_revert_word_to_initial_state_ii;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void minimumTimeToInitialState() {
        assertThat(new Solution().minimumTimeToInitialState("abacaba", 3), equalTo(2));
    }

    @Test
    void minimumTimeToInitialState2() {
        assertThat(new Solution().minimumTimeToInitialState("abacaba", 4), equalTo(2));
    }

    @Test
    void minimumTimeToInitialState3() {
        assertThat(new Solution().minimumTimeToInitialState("abcbabcd", 2), equalTo(4));
    }
}
