package g0101_0200.s0134_gas_station;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canCompleteCircuit() {
        assertThat(
                new Solution()
                        .canCompleteCircuit(new int[] {1, 2, 3, 4, 5}, new int[] {3, 4, 5, 1, 2}),
                equalTo(3));
    }

    @Test
    void canCompleteCircuit2() {
        assertThat(
                new Solution().canCompleteCircuit(new int[] {2, 3, 4}, new int[] {3, 4, 3}),
                equalTo(-1));
    }
}
