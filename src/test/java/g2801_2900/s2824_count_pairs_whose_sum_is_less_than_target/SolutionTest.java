package g2801_2900.s2824_count_pairs_whose_sum_is_less_than_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(new Solution().countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2), equalTo(3));
    }

    @Test
    void countPairs2() {
        assertThat(
                new Solution().countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2), equalTo(10));
    }
}
