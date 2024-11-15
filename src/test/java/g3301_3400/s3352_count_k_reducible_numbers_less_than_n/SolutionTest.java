package g3301_3400.s3352_count_k_reducible_numbers_less_than_n;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countKReducibleNumbers() {
        assertThat(new Solution().countKReducibleNumbers("111", 1), equalTo(3));
    }

    @Test
    void countKReducibleNumbers2() {
        assertThat(new Solution().countKReducibleNumbers("1000", 2), equalTo(6));
    }

    @Test
    void countKReducibleNumbers3() {
        assertThat(new Solution().countKReducibleNumbers("1", 3), equalTo(0));
    }
}
