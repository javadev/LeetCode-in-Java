package g0201_0300.s0264_ugly_number_ii_medium_dynamic_programming_hash_table_math_heap_priority_queue;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void nthUglyNumber() {
        assertThat(new Solution().nthUglyNumber(10), equalTo(12));
    }

    @Test
    public void nthUglyNumber2() {
        assertThat(new Solution().nthUglyNumber(1), equalTo(1));
    }
}
