package g1801_1900.s1837_sum_of_digits_in_base_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumBase() {
        assertThat(new Solution().sumBase(34, 6), equalTo(9));
    }

    @Test
    void sumBase2() {
        assertThat(new Solution().sumBase(10, 10), equalTo(1));
    }
}
