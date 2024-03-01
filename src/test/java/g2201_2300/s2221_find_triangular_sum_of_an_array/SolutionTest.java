package g2201_2300.s2221_find_triangular_sum_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void triangularSum() {
        assertThat(new Solution().triangularSum(new int[] {1, 2, 3, 4, 5}), equalTo(8));
    }

    @Test
    void triangularSum2() {
        assertThat(new Solution().triangularSum(new int[] {5}), equalTo(5));
    }
}
