package g0801_0900.s0826_most_profit_assigning_work;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProfitAssignment() {
        assertThat(
                new Solution()
                        .maxProfitAssignment(
                                new int[] {2, 4, 6, 8, 10},
                                new int[] {10, 20, 30, 40, 50},
                                new int[] {4, 5, 6, 7}),
                equalTo(100));
    }

    @Test
    void maxProfitAssignment2() {
        assertThat(
                new Solution()
                        .maxProfitAssignment(
                                new int[] {85, 47, 57},
                                new int[] {24, 66, 99},
                                new int[] {40, 25, 25}),
                equalTo(0));
    }
}
