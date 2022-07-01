package g2101_2200.s2194_cells_in_a_range_on_an_excel_sheet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void cellsInRange() {
        assertThat(
                new Solution().cellsInRange("K1:L2"),
                equalTo(Arrays.asList("K1", "K2", "L1", "L2")));
    }

    @Test
    void cellsInRange2() {
        assertThat(
                new Solution().cellsInRange("A1:F1"),
                equalTo(Arrays.asList("A1", "B1", "C1", "D1", "E1", "F1")));
    }
}
