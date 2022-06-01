package g2001_2100.s2027_minimum_moves_to_convert_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumMoves() {
        assertThat(new Solution().minimumMoves("XXX"), equalTo(1));
    }

    @Test
    void minimumMoves2() {
        assertThat(new Solution().minimumMoves("XXOX"), equalTo(2));
    }

    @Test
    void minimumMoves3() {
        assertThat(new Solution().minimumMoves("OOOO"), equalTo(0));
    }
}
