package g3801_3900.s3853_merge_close_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeCharacters() {
        assertThat(new Solution().mergeCharacters("abca", 3), equalTo("abc"));
    }

    @Test
    void mergeCharacters2() {
        assertThat(new Solution().mergeCharacters("aabca", 2), equalTo("abca"));
    }

    @Test
    void mergeCharacters3() {
        assertThat(new Solution().mergeCharacters("yybyzybz", 2), equalTo("ybzybz"));
    }
}
