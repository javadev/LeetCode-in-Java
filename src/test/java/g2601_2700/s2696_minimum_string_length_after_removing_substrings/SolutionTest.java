package g2601_2700.s2696_minimum_string_length_after_removing_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minLength() {
        assertThat(new Solution().minLength("ABFCACDB"), equalTo(2));
    }

    @Test
    void minLength2() {
        assertThat(new Solution().minLength("ACBBD"), equalTo(5));
    }
}
