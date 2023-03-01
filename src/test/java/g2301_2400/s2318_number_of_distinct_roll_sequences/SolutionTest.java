package g2301_2400.s2318_number_of_distinct_roll_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctSequences() {
        assertThat(new Solution().distinctSequences(4), equalTo(184));
    }

    @Test
    void distinctSequences2() {
        assertThat(new Solution().distinctSequences(2), equalTo(22));
    }
}
