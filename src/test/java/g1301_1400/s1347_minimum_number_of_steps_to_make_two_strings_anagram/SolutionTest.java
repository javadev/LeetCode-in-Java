package g1301_1400.s1347_minimum_number_of_steps_to_make_two_strings_anagram;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSteps() {
        assertThat(new Solution().minSteps("bab", "aba"), equalTo(1));
    }

    @Test
    void minSteps2() {
        assertThat(new Solution().minSteps("leetcode", "practice"), equalTo(5));
    }

    @Test
    void minSteps3() {
        assertThat(new Solution().minSteps("anagram", "anagram"), equalTo(0));
    }
}
