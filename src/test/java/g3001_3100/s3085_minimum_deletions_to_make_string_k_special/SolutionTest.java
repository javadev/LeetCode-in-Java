package g3001_3100.s3085_minimum_deletions_to_make_string_k_special;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDeletions() {
        assertThat(new Solution().minimumDeletions("aabcaba", 0), equalTo(3));
    }

    @Test
    void minimumDeletions2() {
        assertThat(new Solution().minimumDeletions("dabdcbdcdcd", 2), equalTo(2));
    }

    @Test
    void minimumDeletions3() {
        assertThat(new Solution().minimumDeletions("aaabaaa", 2), equalTo(1));
    }
}
