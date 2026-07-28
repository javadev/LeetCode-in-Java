package g3801_3900.s3853_merge_close_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergesClosestRepeatedCharacters() {
        Solution solution = new Solution();

        assertThat(solution.mergeCharacters("abca", 3), equalTo("abc"));
        assertThat(solution.mergeCharacters("aabca", 2), equalTo("abca"));
        assertThat(solution.mergeCharacters("yybyzybz", 2), equalTo("ybzybz"));
    }
}
