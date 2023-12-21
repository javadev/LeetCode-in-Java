package g2101_2200.s2172_maximum_and_sum_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumANDSum() {
        assertThat(new Solution().maximumANDSum(new int[] {1, 2, 3, 4, 5, 6}, 3), equalTo(9));
    }

    @Test
    void maximumANDSum2() {
        assertThat(new Solution().maximumANDSum(new int[] {1, 3, 10, 4, 7, 1}, 9), equalTo(24));
    }
}
