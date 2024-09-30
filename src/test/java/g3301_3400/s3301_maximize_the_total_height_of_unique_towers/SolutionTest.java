package g3301_3400.s3301_maximize_the_total_height_of_unique_towers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumTotalSum() {
        assertThat(new Solution().maximumTotalSum(new int[] {2, 3, 4, 3}), equalTo(10L));
    }

    @Test
    void maximumTotalSum2() {
        assertThat(new Solution().maximumTotalSum(new int[] {15, 10}), equalTo(25L));
    }

    @Test
    void maximumTotalSum3() {
        assertThat(new Solution().maximumTotalSum(new int[] {2, 2, 1}), equalTo(-1L));
    }
}
