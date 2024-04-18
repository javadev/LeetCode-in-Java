package g3001_3100.s3090_maximum_length_substring_with_two_occurrences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumLengthSubstring() {
        assertThat(new Solution().maximumLengthSubstring("bcbbbcba"), equalTo(4));
    }

    @Test
    void maximumLengthSubstring2() {
        assertThat(new Solution().maximumLengthSubstring("aaaa"), equalTo(2));
    }
}
