package g1001_1100.s1079_letter_tile_possibilities;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numTilePossibilities() {
        assertThat(new Solution().numTilePossibilities("AAB"), equalTo(8));
    }

    @Test
    void numTilePossibilities2() {
        assertThat(new Solution().numTilePossibilities("AAABBC"), equalTo(188));
    }

    @Test
    void numTilePossibilities3() {
        assertThat(new Solution().numTilePossibilities("V"), equalTo(1));
    }
}
