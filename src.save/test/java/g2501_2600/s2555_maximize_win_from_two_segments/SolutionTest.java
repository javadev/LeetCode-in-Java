package g2501_2600.s2555_maximize_win_from_two_segments;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeWin() {
        assertThat(new Solution().maximizeWin(new int[] {1, 1, 2, 2, 3, 3, 5}, 2), equalTo(7));
    }

    @Test
    void maximizeWin2() {
        assertThat(new Solution().maximizeWin(new int[] {1, 2, 3, 4}, 0), equalTo(2));
    }
}
