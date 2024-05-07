package g3101_3200.s3138_minimum_length_of_anagram_concatenation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAnagramLength() {
        assertThat(new Solution().minAnagramLength("abba"), equalTo(2));
    }

    @Test
    void minAnagramLength2() {
        assertThat(new Solution().minAnagramLength("cdef"), equalTo(4));
    }
}
