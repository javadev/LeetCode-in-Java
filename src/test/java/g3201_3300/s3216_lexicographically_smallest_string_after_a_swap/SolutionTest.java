package g3201_3300.s3216_lexicographically_smallest_string_after_a_swap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getSmallestString() {
        assertThat(new Solution().getSmallestString("45320"), equalTo("43520"));
    }

    @Test
    void getSmallestString2() {
        assertThat(new Solution().getSmallestString("001"), equalTo("001"));
    }
}
