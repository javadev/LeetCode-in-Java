package g3501_3600.s3557_find_maximum_number_of_non_intersecting_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubstrings() {
        assertThat(new Solution().maxSubstrings("abcdeafdef"), equalTo(2));
    }

    @Test
    void maxSubstrings2() {
        assertThat(new Solution().maxSubstrings("bcdaaaab"), equalTo(1));
    }
}
