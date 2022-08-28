package g1601_1700.s1653_minimum_deletions_to_make_string_balanced;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDeletions() {
        assertThat(new Solution().minimumDeletions("aababbab"), equalTo(2));
    }

    @Test
    void minimumDeletions2() {
        assertThat(new Solution().minimumDeletions("bbaaaaabb"), equalTo(2));
    }
}
