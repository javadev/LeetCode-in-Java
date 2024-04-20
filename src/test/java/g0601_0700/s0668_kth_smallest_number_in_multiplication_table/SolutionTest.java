package g0601_0700.s0668_kth_smallest_number_in_multiplication_table;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findKthNumber() {
        assertThat(new Solution().findKthNumber(3, 3, 5), equalTo(3));
    }

    @Test
    void findKthNumber2() {
        assertThat(new Solution().findKthNumber(2, 3, 6), equalTo(6));
    }
}
