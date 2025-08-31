package g3601_3700.s3671_sum_of_beautiful_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalBeauty() {
        assertThat(new Solution().totalBeauty(new int[] {1, 2, 3}), equalTo(10));
    }

    @Test
    void totalBeauty2() {
        assertThat(new Solution().totalBeauty(new int[] {4, 6}), equalTo(12));
    }
}
