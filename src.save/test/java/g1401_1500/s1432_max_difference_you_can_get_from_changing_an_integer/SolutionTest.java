package g1401_1500.s1432_max_difference_you_can_get_from_changing_an_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDiff() {
        assertThat(new Solution().maxDiff(555), equalTo(888));
    }

    @Test
    void maxDiff2() {
        assertThat(new Solution().maxDiff(9), equalTo(8));
    }
}
