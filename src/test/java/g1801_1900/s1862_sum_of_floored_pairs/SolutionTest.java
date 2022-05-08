package g1801_1900.s1862_sum_of_floored_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfFlooredPairs() {
        assertThat(new Solution().sumOfFlooredPairs(new int[] {2, 5, 9}), equalTo(10));
    }

    @Test
    void sumOfFlooredPairs2() {
        assertThat(new Solution().sumOfFlooredPairs(new int[] {7, 7, 7, 7, 7, 7, 7}), equalTo(49));
    }
}
