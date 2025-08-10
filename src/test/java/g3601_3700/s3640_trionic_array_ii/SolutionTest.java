package g3601_3700.s3640_trionic_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumTrionic() {
        assertThat(new Solution().maxSumTrionic(new int[] {0, -2, -1, -3, 0, 2, -1}), equalTo(-4L));
    }

    @Test
    void maxSumTrionic2() {
        assertThat(new Solution().maxSumTrionic(new int[] {1, 4, 2, 7}), equalTo(14L));
    }
}
