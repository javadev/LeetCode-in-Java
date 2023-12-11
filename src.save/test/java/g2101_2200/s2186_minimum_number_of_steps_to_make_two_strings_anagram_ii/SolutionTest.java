package g2101_2200.s2186_minimum_number_of_steps_to_make_two_strings_anagram_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSteps() {
        assertThat(new Solution().minSteps("leetcode", "coats"), equalTo(7));
    }

    @Test
    void minSteps2() {
        assertThat(new Solution().minSteps("night", "thing"), equalTo(0));
    }
}
