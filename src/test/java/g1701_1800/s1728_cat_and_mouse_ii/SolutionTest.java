package g1701_1800.s1728_cat_and_mouse_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMouseWin() {
        assertThat(
                new Solution().canMouseWin(new String[] {"####F", "#C...", "M...."}, 1, 2),
                equalTo(true));
    }

    @Test
    void canMouseWin2() {
        assertThat(new Solution().canMouseWin(new String[] {"M.C...F"}, 1, 4), equalTo(true));
    }

    @Test
    void canMouseWin3() {
        assertThat(new Solution().canMouseWin(new String[] {"M.C...F"}, 1, 3), equalTo(false));
    }
}
