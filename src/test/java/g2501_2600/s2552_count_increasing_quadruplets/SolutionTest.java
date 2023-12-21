package g2501_2600.s2552_count_increasing_quadruplets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countQuadruplets() {
        assertThat(new Solution().countQuadruplets(new int[] {1, 3, 2, 4, 5}), equalTo(2L));
    }

    @Test
    void countQuadruplets2() {
        assertThat(
                new Solution()
                        .countQuadruplets(
                                new int[] {
                                    1, 2, 3, 4,
                                }),
                equalTo(0L));
    }
}
