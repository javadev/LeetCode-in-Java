package g1401_1500.s1420_build_array_where_you_can_find_the_maximum_exactly_k_comparisons;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfArrays() {
        assertThat(new Solution().numOfArrays(2, 3, 1), equalTo(6));
    }

    @Test
    void numOfArrays2() {
        assertThat(new Solution().numOfArrays(5, 2, 3), equalTo(0));
    }

    @Test
    void numOfArrays3() {
        assertThat(new Solution().numOfArrays(9, 1, 1), equalTo(1));
    }
}
