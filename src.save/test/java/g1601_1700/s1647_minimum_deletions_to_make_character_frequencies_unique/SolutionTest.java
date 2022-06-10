package g1601_1700.s1647_minimum_deletions_to_make_character_frequencies_unique;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDeletions() {
        assertThat(new Solution().minDeletions("aab"), equalTo(0));
    }

    @Test
    void minDeletions2() {
        assertThat(new Solution().minDeletions("aaabbbcc"), equalTo(2));
    }

    @Test
    void minDeletions3() {
        assertThat(new Solution().minDeletions("ceabaacb"), equalTo(2));
    }
}
