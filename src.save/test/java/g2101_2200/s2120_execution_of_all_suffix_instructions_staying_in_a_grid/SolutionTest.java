package g2101_2200.s2120_execution_of_all_suffix_instructions_staying_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void executeInstructions() {
        assertThat(
                new Solution().executeInstructions(3, new int[] {0, 1}, "RRDDLU"),
                equalTo(new int[] {1, 5, 4, 3, 1, 0}));
    }

    @Test
    void executeInstructions2() {
        assertThat(
                new Solution().executeInstructions(2, new int[] {1, 1}, "LURD"),
                equalTo(new int[] {4, 1, 0, 0}));
    }

    @Test
    void executeInstructions3() {
        assertThat(
                new Solution().executeInstructions(1, new int[] {0, 0}, "LRUD"),
                equalTo(new int[] {0, 0, 0, 0}));
    }
}
