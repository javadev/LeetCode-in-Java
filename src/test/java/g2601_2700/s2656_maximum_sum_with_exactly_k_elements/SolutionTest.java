package g2601_2700.s2656_maximum_sum_with_exactly_k_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeSum() {
        assertThat(new Solution().maximizeSum(new int[] {1, 2, 3, 4, 5}, 3), equalTo(18));
    }

    @Test
    void maximizeSum2() {
        assertThat(new Solution().maximizeSum(new int[] {5, 5, 5}, 2), equalTo(11));
    }
}
