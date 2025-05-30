package g3301_3400.s3398_smallest_substring_with_identical_characters_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minLength() {
        assertThat(new Solution().minLength("000001", 1), equalTo(2));
    }

    @Test
    void minLength2() {
        assertThat(new Solution().minLength("0000", 2), equalTo(1));
    }

    @Test
    void minLength3() {
        assertThat(new Solution().minLength("0101", 0), equalTo(1));
    }

    @Test
    void minLength4() {
        assertThat(new Solution().minLength("000", 2), equalTo(1));
    }
}
