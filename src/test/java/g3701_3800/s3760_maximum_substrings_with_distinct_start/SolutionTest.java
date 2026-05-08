package g3701_3800.s3760_maximum_substrings_with_distinct_start;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistinct() {
        assertThat(new Solution().maxDistinct("abca"), equalTo(3));
    }

    @Test
    void maxDistinct2() {
        assertThat(new Solution().maxDistinct("aaaa"), equalTo(1));
    }

    @Test
    void maxDistinct3() {
        assertThat(new Solution().maxDistinct("abcdefghijklmnopqrstuvwxyz"), equalTo(26));
    }
}
