package g0901_1000.s0982_triples_with_bitwise_and_equal_to_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countTriplets() {
        assertThat(new Solution().countTriplets(new int[] {2, 1, 3}), equalTo(12));
    }

    @Test
    void countTriplets2() {
        assertThat(new Solution().countTriplets(new int[] {0, 0, 0}), equalTo(27));
    }
}
