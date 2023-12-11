package g2801_2900.s2829_determine_the_minimum_sum_of_a_k_avoiding_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSum() {
        assertThat(new Solution().minimumSum(5, 4), equalTo(18));
    }

    @Test
    void minimumSum2() {
        assertThat(new Solution().minimumSum(2, 6), equalTo(3));
    }
}
