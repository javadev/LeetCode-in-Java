package g0501_0600.s0567_permutation_in_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkInclusion() {
        assertThat(new Solution().checkInclusion("ab", "eidbaooo"), equalTo(true));
    }

    @Test
    void checkInclusion2() {
        assertThat(new Solution().checkInclusion("ab", "eidboaoo"), equalTo(false));
    }
}
