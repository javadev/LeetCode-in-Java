package g3901_4000.s3971_maximum_total_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTotalValue() {
        assertThat(
                new Solution().maxTotalValue(new int[] {6, 5, 4}, new int[] {2, 1, 1}, 4),
                equalTo(19));
    }

    @Test
    void maxTotalValue2() {
        assertThat(
                new Solution().maxTotalValue(new int[] {7, 2, 2}, new int[] {3, 2, 1}, 2),
                equalTo(11));
    }

    @Test
    void maxTotalValue3() {
        assertThat(new Solution().maxTotalValue(new int[] {4, 3}, new int[] {5, 4}, 5), equalTo(7));
    }
}
