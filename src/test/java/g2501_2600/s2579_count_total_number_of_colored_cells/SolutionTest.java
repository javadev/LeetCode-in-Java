package g2501_2600.s2579_count_total_number_of_colored_cells;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void coloredCells() {
        assertThat(new Solution().coloredCells(1), equalTo(1L));
    }

    @Test
    void coloredCells2() {
        assertThat(new Solution().coloredCells(2), equalTo(5L));
    }
}
