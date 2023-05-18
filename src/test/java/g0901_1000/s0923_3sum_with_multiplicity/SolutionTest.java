package g0901_1000.s0923_3sum_with_multiplicity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void threeSumMulti() {
        assertThat(
                new Solution().threeSumMulti(new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8),
                equalTo(20));
    }

    @Test
    void threeSumMulti2() {
        assertThat(new Solution().threeSumMulti(new int[] {1, 1, 2, 2, 2, 2}, 5), equalTo(12));
    }
}
