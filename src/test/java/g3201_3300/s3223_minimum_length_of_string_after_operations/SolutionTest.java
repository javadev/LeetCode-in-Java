package g3201_3300.s3223_minimum_length_of_string_after_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumLength() {
        assertThat(new Solution().minimumLength("abaacbcbb"), equalTo(5));
    }

    @Test
    void minimumLength2() {
        assertThat(new Solution().minimumLength("aa"), equalTo(2));
    }
}
