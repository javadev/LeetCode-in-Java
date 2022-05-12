package g1801_1900.s1812_determine_color_of_a_chessboard_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void squareIsWhite() {
        assertThat(new Solution().squareIsWhite("a1"), equalTo(false));
    }

    @Test
    void squareIsWhite2() {
        assertThat(new Solution().squareIsWhite("h3"), equalTo(true));
    }

    @Test
    void squareIsWhite3() {
        assertThat(new Solution().squareIsWhite("c7"), equalTo(false));
    }
}
