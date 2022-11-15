package g2401_2500.s2414_length_of_the_longest_alphabetical_continuous_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestContinuousSubstring() {
        assertThat(new Solution().longestContinuousSubstring(""), equalTo(1));
    }
}
