package g3301_3400.s3364_minimum_positive_sum_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSumSubarray() {
        assertThat(new Solution().minimumSumSubarray(List.of(3, -2, 1, 4), 2, 3), equalTo(1));
    }

    @Test
    void minimumSumSubarray2() {
        assertThat(new Solution().minimumSumSubarray(List.of(-2, 2, -3, 1), 2, 3), equalTo(-1));
    }

    @Test
    void minimumSumSubarray3() {
        assertThat(new Solution().minimumSumSubarray(List.of(1, 2, 3, 4), 2, 4), equalTo(3));
    }
}
