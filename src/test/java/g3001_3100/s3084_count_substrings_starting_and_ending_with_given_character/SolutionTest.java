package g3001_3100.s3084_count_substrings_starting_and_ending_with_given_character;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubstrings() {
        assertThat(new Solution().countSubstrings("abada", 'a'), equalTo(6L));
    }

    @Test
    void countSubstrings2() {
        assertThat(new Solution().countSubstrings("zzz", 'z'), equalTo(6L));
    }
}
