package g2401_2500.s2442_count_number_of_distinct_integers_after_reverse_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDistinctIntegers() {
        assertThat(new Solution().countDistinctIntegers(new int[] {1, 13, 10, 12, 31}), equalTo(6));
    }

    @Test
    void countDistinctIntegers2() {
        assertThat(new Solution().countDistinctIntegers(new int[] {2, 2, 2}), equalTo(1));
    }
}
