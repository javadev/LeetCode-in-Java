package g1101_1200.s1138_alphabet_board_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void alphabetBoardPath() {
        assertThat(new Solution().alphabetBoardPath("leet"), equalTo("DDR!UURRR!!DDD!"));
    }

    @Test
    void alphabetBoardPath2() {
        assertThat(new Solution().alphabetBoardPath("code"), equalTo("RR!DDRR!LUU!R!"));
    }
}
