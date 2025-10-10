package g3701_3800.s3701_compute_alternating_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void alternatingSum() {
        assertThat(new Solution().alternatingSum(new int[] {1, 3, 5, 7}), equalTo(-4));
    }

    @Test
    void alternatingSum2() {
        assertThat(new Solution().alternatingSum(new int[] {100}), equalTo(100));
    }
}
