package g1301_1400.s1387_sort_integers_by_the_power_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getKth() {
        assertThat(new Solution().getKth(12, 15, 2), equalTo(13));
    }

    @Test
    void getKth2() {
        assertThat(new Solution().getKth(7, 11, 4), equalTo(7));
    }
}
