package g0201_0300.s0260_single_number_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void singleNumber() {
        assertThat(
                new Solution().singleNumber(new int[] {1, 2, 1, 3, 2, 5}),
                equalTo(new int[] {3, 5}));
    }

    @Test
    void singleNumber2() {
        assertThat(new Solution().singleNumber(new int[] {-1, 0}), equalTo(new int[] {-1, 0}));
    }
}
