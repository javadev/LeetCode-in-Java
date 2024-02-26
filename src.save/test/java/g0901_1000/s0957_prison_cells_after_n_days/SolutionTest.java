package g0901_1000.s0957_prison_cells_after_n_days;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void prisonAfterNDays() {
        assertThat(
                new Solution().prisonAfterNDays(new int[] {0, 1, 0, 1, 1, 0, 0, 1}, 7),
                equalTo(new int[] {0, 0, 1, 1, 0, 0, 0, 0}));
    }

    @Test
    void prisonAfterNDays2() {
        assertThat(
                new Solution().prisonAfterNDays(new int[] {1, 0, 0, 1, 0, 0, 1, 0}, 1000000000),
                equalTo(new int[] {0, 0, 1, 1, 1, 1, 1, 0}));
    }
}
