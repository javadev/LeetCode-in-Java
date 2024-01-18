package g1201_1300.s1224_maximum_equal_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxEqualFreq() {
        assertThat(new Solution().maxEqualFreq(new int[] {2, 2, 1, 1, 5, 3, 3, 5}), equalTo(7));
    }

    @Test
    void maxEqualFreq2() {
        assertThat(
                new Solution().maxEqualFreq(new int[] {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5}),
                equalTo(13));
    }
}
