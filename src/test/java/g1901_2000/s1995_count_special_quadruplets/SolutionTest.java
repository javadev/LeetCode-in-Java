package g1901_2000.s1995_count_special_quadruplets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countQuadruplets() {
        assertThat(new Solution().countQuadruplets(new int[] {1, 2, 3, 6}), equalTo(1));
    }

    @Test
    void countQuadruplets2() {
        assertThat(new Solution().countQuadruplets(new int[] {3, 3, 6, 4, 5}), equalTo(0));
    }

    @Test
    void countQuadruplets3() {
        assertThat(new Solution().countQuadruplets(new int[] {1, 1, 1, 3, 5}), equalTo(4));
    }
}
