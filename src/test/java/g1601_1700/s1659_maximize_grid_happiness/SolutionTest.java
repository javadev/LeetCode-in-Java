package g1601_1700.s1659_maximize_grid_happiness;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMaxGridHappiness() {
        assertThat(new Solution().getMaxGridHappiness(2, 3, 1, 2), equalTo(240));
    }

    @Test
    void getMaxGridHappiness2() {
        assertThat(new Solution().getMaxGridHappiness(3, 1, 2, 1), equalTo(260));
    }

    @Test
    void getMaxGridHappiness3() {
        assertThat(new Solution().getMaxGridHappiness(2, 2, 4, 0), equalTo(240));
    }
}
