package g0901_1000.s0961_n_repeated_element_in_size_2n_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void repeatedNTimes() {
        assertThat(new Solution().repeatedNTimes(new int[] {1, 2, 3, 3}), equalTo(3));
    }

    @Test
    void repeatedNTimes2() {
        assertThat(new Solution().repeatedNTimes(new int[] {2, 1, 2, 5, 3, 2}), equalTo(2));
    }

    @Test
    void repeatedNTimes3() {
        assertThat(new Solution().repeatedNTimes(new int[] {5, 1, 5, 2, 5, 3, 5, 4}), equalTo(5));
    }
}
