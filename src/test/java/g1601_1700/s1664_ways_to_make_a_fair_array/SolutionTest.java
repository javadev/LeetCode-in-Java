package g1601_1700.s1664_ways_to_make_a_fair_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void waysToMakeFair() {
        assertThat(new Solution().waysToMakeFair(new int[] {2, 1, 6, 4}), equalTo(1));
    }

    @Test
    void waysToMakeFair2() {
        assertThat(new Solution().waysToMakeFair(new int[] {1, 1, 1}), equalTo(3));
    }

    @Test
    void waysToMakeFair3() {
        assertThat(new Solution().waysToMakeFair(new int[] {1, 2, 3}), equalTo(0));
    }
}
