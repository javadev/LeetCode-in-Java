package g2901_3000.s2957_remove_adjacent_almost_equal_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeAlmostEqualCharacters() {
        assertThat(new Solution().removeAlmostEqualCharacters("aaaaa"), equalTo(2));
    }

    @Test
    void removeAlmostEqualCharacters2() {
        assertThat(new Solution().removeAlmostEqualCharacters("abddez"), equalTo(2));
    }

    @Test
    void removeAlmostEqualCharacters3() {
        assertThat(new Solution().removeAlmostEqualCharacters("zyxyxyz"), equalTo(3));
    }
}
