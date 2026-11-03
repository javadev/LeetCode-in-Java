package g3901_4000.s3981_count_distinct_ways_to_form_target_from_two_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void interleaveCharacters() {
        assertThat(new Solution().interleaveCharacters("abc", "bac", "abc"), equalTo(5));
    }

    @Test
    void interleaveCharacters2() {
        assertThat(new Solution().interleaveCharacters("cd", "cd", "ccd"), equalTo(4));
    }

    @Test
    void interleaveCharacters3() {
        assertThat(new Solution().interleaveCharacters("xy", "xy", "xyxy"), equalTo(2));
    }

    @Test
    void interleaveCharacters4() {
        assertThat(new Solution().interleaveCharacters("ab", "cde", "ace"), equalTo(1));
    }
}
